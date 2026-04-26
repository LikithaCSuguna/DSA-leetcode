/*

Problem #39: 
Find all combinations where sum is equal to target using given numbers (repetition allowed).

Approach:
Use backtracking to explore all possibilities by choosing or skipping elements.

Time Complexity: O(2^target)
Space Complexity: O(target)

*/

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates,int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int i,int[] arr,int target,List<Integer> list,List<List<Integer>> ans) {
        if (target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if (i == arr.length || target < 0){
            return;
        }
        list.add(arr[i]);
        solve(i,arr,target-arr[i],list,ans);
        list.remove(list.size()-1);
        solve(i+1,arr,target,list,ans);
    }
}
