/*

Problem #67:
Given a string, check if its characters can be rearranged to form a palindrome.
Return true if possible, otherwise return false.

Approach :
Count the frequency of each character in the string.
If at most one character has an odd count, a palindrome can be formed.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public String addBinary(String a,String b){
        StringBuilder result=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i >= 0 || j >= 0 || carry == 1){
            int sum=carry;
            if(i >= 0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            result.append(sum%2); 
            carry=sum/2;      
        }
        return result.reverse().toString();
    }
}
