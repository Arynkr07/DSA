/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return sym(root.left,root.right);
    }
    boolean sym(TreeNode T1, TreeNode T2){
        if(T1 == null && T2 == null) return true;
        if(T1 == null || T2 == null) return false;
        return (T1.val == T2.val) && sym(T1.left ,T2.right) && sym(T1.right,T2.left);
    }
}