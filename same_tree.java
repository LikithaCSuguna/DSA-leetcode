/*

Problem #100:
Given two binary trees, determine whether they are identical in both structure and node values.
Return true if every corresponding node matches, otherwise return false.

Approach:
Use recursion to compare nodes: if both are null return true, if one is null or values differ return false.
Recursively check left and right subtrees of both trees for equality.

Time Complexity: O(n) 
Space Complexity: O(h)

*/

class Solution{
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
