
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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE,Long.MAX_VALUE);
    
    
    }

    public boolean valid(TreeNode root,long l,long h){
        if(root==null) return true;
        if(root.right==null && root.left==null) return root.val>l && root.val<h;

        if(root.val<=l || root.val>=h) return false;

        return valid(root.left, l, root.val) && valid(root.right, root.val, h);

    }

}
