/*

Problem #38:
Given an integer n, generate the nth term of the count-and-say sequence, starting from "1".
Each term is formed by applying run-length encoding (RLE) to the previous term.

Approach:
Start with "1" and iteratively build each term by counting consecutive digits in the previous string.
Append count + digit for each group to form the next term until reaching n.

Time Complexity: O(n×m) 
Space Complexity: O(m)

*/

class Solution {
    public String countAndSay(int n) {
        String result="1";  
        for(int i=2;i<=n;i++){
            StringBuilder temp=new StringBuilder();
            int count=1;
            for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;
                }else{
                    temp.append(count).append(result.charAt(j-1));
                    count=1;
                }
            }
            temp.append(count).append(result.charAt(result.length()-1));   
            result=temp.toString();
        }
        return result;
    }
}
