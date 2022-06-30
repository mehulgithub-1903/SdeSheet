/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null; 
        int curr=root.val;
        int pv=p.val;
        int qv=q.val;
        if(curr>pv && curr>qv){
            return lowestCommonAncestor(root.left,p,q);
        }else if(curr<pv && curr<qv){
            return lowestCommonAncestor(root.right,p,q);
        }
        
        return root;
    }
}
