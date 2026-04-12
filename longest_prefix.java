/*

Problem:
Find the longest prefix common to all strings in the array.
Return "" if no such prefix exists.

Approach:
Compare characters index by index using the first string.
Stop when any mismatch or string end is found and return the prefix.

Complexity:
Time: O(n×m)
Space: O(1)

*/

class Solution{
    public String longestCommonPrefix(String[] strs){
        String ans="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch){
                    return ans;
                }
            }
            ans=ans+ch;
        }
        return ans;
    }
}
