/*

Problem #387:
Given a string s, find the index of the first character that appears only once.
If no such character exists, return -1.

Approach:
Count the frequency of each character using an array or hashmap.
Traverse the string again and return the first index whose frequency is 1.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        // Find first unique character
        for (int i = 0;i<s.length();i++){
            if (freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
