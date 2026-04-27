/*

Problem #190:
Given a 32-bit integer, reverse its binary representation bit by bit.
Return the integer formed after reversing all 32 bits.

Approach:
Iterate 32 times, extract the last bit using n & 1 and add it to the result.
Shift result left and input right in each step to build the reversed bits.

Time Complexity: O(1)
Space Complexity: O(1)

*/

class Solution {
    public int reverseBits(int n){
        int result = 0;
        for (int i = 0; i < 32; i++){
            result <<= 1;              
            result |= (n & 1);         
            n >>= 1;                 
        }
        return result;
    }
}
