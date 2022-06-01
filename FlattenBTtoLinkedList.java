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
    public void flatten(TreeNode root) {
            if(root==null) return;
        if(root.left==null && root.right==null) return;

        TreeNode temp=root.right;
        flatten(root.left);
        root.right=root.left;
        root.left=null;
        flatten(temp);
        TreeNode t=root;
        while(t.right!=null) t=t.right;
        t.right=temp;
        return;

    }
    
}
