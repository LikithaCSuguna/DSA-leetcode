/*

Problem #28:
Find the first occurrence of a substring (needle) 
inside another string (haystack).
Return its starting index, or -1 if the substring does not exist.

Approach:
Iterate through the haystack and check each possible substring 
of needle’s length.Compare characters or substrings, 
and return the index when a match is found.

Time Complexity: O(n * m)
Space Complexity: O(1)

*/

class Solution {
    public int strStr(String haystack, String needle){
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i + m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
