/*

Problem #75:
Given an array containing only 0s, 1s, and 2s, 
sort it in-place so that all 0s come first, then 1s, and then 2s.

Approach:
Use the Dutch National Flag algorithm with three pointers (low, mid, high)
to partition the array in a single pass without extra space.

Complexity:
Time: O(n)
Space: O(1) 

*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
