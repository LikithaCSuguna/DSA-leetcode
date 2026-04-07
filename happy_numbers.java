/*

Problem #202:
Given a number n, repeatedly replace it with the sum of squares of its digits.
Return true if it becomes 1(happy), otherwise false if it enters a cycle.

Approach:
Use a HashSet to track visited numbers while computing sum of squares of digits.
If n==1 return true, if a number repeats cycle  continues and return false.
*
Time Complexity: O(log n)
Space Complexity: O(log n)

*/
import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }   
        return n == 1;
    }
    private int getNext(int n) {
        int sum=0; 
        while(n>0){
            int digit = n%10;
            sum += digit * digit;
            n/=10;
        }     
        return sum;
    }
}
