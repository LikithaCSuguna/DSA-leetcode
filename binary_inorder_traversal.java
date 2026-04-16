/*

Problem #94:
Traverse a binary tree in inorder and return the node values.
If the tree is empty, return an empty list.

Approach:
Use a stack to simulate recursion and keep moving to the leftmost node.
Then process the node and move to its right subtree until all nodes are visited.

Time Complexity: O(n)
Space Complexity: O(n)

*/
import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()) {
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}
