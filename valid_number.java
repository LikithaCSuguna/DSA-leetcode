/*

Problem #65: 
Check if a string represents a valid number including integers, decimals, and scientific notation (e/E).
The string may contain signs (+, -), decimal points, and exponent parts.

Approach:
Traverse the string once and track flags like digit seen, dot seen, exponent seen.
Validate positions of +/-, ., and e/E based on strict rules.

Complexity
Time: O(n)
Space: O(1)

*/

class Solution {
    public boolean isNumber(String s){
        s = s.trim(); 
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExp = false;
        for (int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                seenDigit = true;
            } 
            else if (ch=='+' || ch=='-') {
                if (i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') {
                    return false;
                }
            } 
            else if (ch=='.') {
                if (seenDot || seenExp) return false;
                seenDot = true;
            } 
            else if (ch=='e' || ch=='E') {
                if (seenExp || !seenDigit) return false;
                seenExp = true;
                seenDigit = false; 
            } 
            else {
                return false;
            }
        }
        return seenDigit;
    }
}
