/*

Problem #509:
Given an integer n, compute the nth Fibonacci number where each term is the sum of the previous two terms.

Approach:
Use dynamic programming to iteratively compute Fibonacci values from 0 to n, avoiding repeated calculations.

Complexity:
Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;
        int prev2 = 0, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

