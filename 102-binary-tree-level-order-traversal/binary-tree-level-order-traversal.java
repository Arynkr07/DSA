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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> result = new ArrayList<>();
            int n = q.size();
            for(int i = 0;i<n;i++){
                TreeNode curr = q.poll();
                result.add(curr.val);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                System.out.print(curr.val + " ");
            }
            arr.add(result);
            System.out.println();
        }
        return arr;
    }
}