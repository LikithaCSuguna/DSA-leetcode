/*

Problem #46:
Generate all possible arrangements (permutations) of given distinct integers.

Approach:
Use Backtracking by fixing one element at a time and recursively permuting the remaining elements.
Swap elements to generate new permutations, then backtrack to restore the array.

Time Complexity: O(n!) 
Space Complexity: O(n)

*/

import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,result);
        return result;
    }
    private void backtrack(int[] nums,int start,List<List<Integer>> result){
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num:nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums,start,i);
            backtrack(nums,start + 1,result);
            swap(nums,start,i);
        }
    }
    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
