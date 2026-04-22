/*

Problem #70:
Given n steps, you can climb either 1 or 2 steps at a time. find the total number of distinct ways to reach the top.

Approach:
Use Dynamic Programming where ways to reach step n = ways to reach (n-1) + (n-2) (Fibonacci pattern).

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int prev2 = 1; 
        int prev1 = 2; 
        for(int i = 3;i <= n;i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
