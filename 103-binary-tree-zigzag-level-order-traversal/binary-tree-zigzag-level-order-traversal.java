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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Boolean l =true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode curr = q.poll();
                if(l){
                    ans.add(curr.val);
                }
                else{
                    ans.add(0,curr.val);
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add(ans);
            l = !l;
        }
        return result;
    }
}