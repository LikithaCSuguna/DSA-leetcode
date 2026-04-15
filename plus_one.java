/*

Problem #66:
Given an array representing a number, add 1 to it.
Return the updated array after handling carry properly.

Approach:
Start from the last digit, add 1 and handle carry (if digit becomes 10).
If all digits are 9 then create new array with leading 1.

Complexity:
Time: O(n)
Space: O(1)

*/
class Solution{
    public int[] plusOne(int[] digits){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0; 
        }
        int[] result=new int[n+1];
        result[0]=1;
        return result;
    }
}
