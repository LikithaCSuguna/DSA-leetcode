/*

Problem #27:
Remove all occurrences of a given value val from an array nums in-place and return the count of remaining elements.

Approach: 
Use a two-pointer method to overwrite elements not equal to val at the start of the array, keeping track of the new length k.

Time Complexity: O(n)
Space Complexity: O(1)

*/


class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; 
            }
        }
        return k; 
    }
}
