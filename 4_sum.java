/*

Problem #18:
Find all unique sets of four numbers in the array whose sum equals the given target.
Each quadruplet must use different indices and should not be repeated.

Approach:
Sort the array, fix two numbers, and use two pointers to find the remaining pair.
Skip duplicate elements at every step to ensure only unique quadruplets are added.

Time Complexity: O(n³)
Space Complexity: O(1)
*/

import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0;i<n-3;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            for (int j=i+1;j<n-2;j++) {
                if (j > i + 1 && nums[j]==nums[j-1]) continue; 
                int left=j+1;
                int right=n-1;
                while (left<right) {
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left]==nums[left-1]) left++;
                        while (left < right && nums[right]==nums[right+1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
