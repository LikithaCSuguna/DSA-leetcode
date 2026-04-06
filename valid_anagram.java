/*

Problem #242:
Check whether two given strings contain the same characters with the same frequencies.
Return true if one string is just a rearrangement of the other, else return false.

Approach:
Use a frequency array to count characters in one string and subtract using the other.
If all counts become zero, the strings are anagrams otherwise, they are not.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count:freq){
            if (count != 0) return false;
        }
        return true;
    }
}
