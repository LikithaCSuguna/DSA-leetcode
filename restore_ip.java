/*

Problem #93:
Given a digit string,insert dots to form all possible valid IP addresses with exactly 4 segments.
Each segment must be between 0–255 and cannot contain leading zeros.

Approach:
Use backtracking to try placing dots and split the string into 4 parts of length 1–3.
Validate each part and build the result only when all 4 segments are valid and fully used.

Time Complexity: O(1)
Space  Complexity: O(1)

*/

import java.util.*;
class Solution{
    public List<String> restoreIpAddresses(String s){
        List<String>result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(String s,int index,List<String> path,List<String> result){
        if (path.size()==4){
            if (index== s.length()){
                result.add(String.join(".", path));
            }
            return;
        }
        for (int len=1;len<=3;len++){
            if (index + len>s.length()) break;
            String part = s.substring(index, index + len);
            if (isValid(part)){
                path.add(part);
                backtrack(s,index + len,path,result);
                path.remove(path.size()-1); 
            }
        }
    }
    private boolean isValid(String part){
        if (part.length()>1 && part.startsWith("0")) return false;
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
