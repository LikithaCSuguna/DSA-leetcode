/*

Problem #881:
You are given an array people[] where each element represents the weight of a person, and a boat weight limit.
Each boat can carry at most 2 people, and their total weight must not exceed the limit.

Approach:
Sort the array and use two pointers to try pairing the lightest and heaviest person.
if their combined weight is within the limit send them together, o
therwise send the heavier person alone, counting one boat each time until all people are assigned.

Complexity:
Time: O(n log n)
Space: O(1)

*/

import java.util.Arrays;

class Solution{
    public int numRescueBoats(int[] people, int limit){
        Arrays.sort(people); 
        int left = 0;                  
        int right = people.length-1;
        int boats = 0;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit){
                left++;  
            }
            right--;
            boats++; 
        }
        return boats;
    }
}
