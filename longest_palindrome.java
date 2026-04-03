/*

Problem #5: 
Find the longest substring in a given string that reads 
the same forward and backward (palindrome).

Approach:
Expand around each character (and pair of characters) as the 
center and keep track of the longest palindrome found.

Complexity:
Time: O(n²)
Space: O(1)

*/

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > res.length()) res = odd;
            if (even.length() > res.length()) res = even;
        }
        return res;
    }
    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
