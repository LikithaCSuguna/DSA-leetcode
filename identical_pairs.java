/*

Problem #1512 :
Count the number of pairs (i,j) such that elements are equal and i<j.

Approach:
Use a frequency array and count how many times each number appears.
For each element, add existing frequency to answer.

Complexity:
Time Complexity: O(n)
Space Complexity: O(1)

*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        for (int num:nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }
}
