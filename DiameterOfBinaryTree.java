

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
    class TreePair{
        int dia;//diameter
        int h;//height

        public TreePair(int dia,int h){
            this.dia=dia;
            this.h=h;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreePair rp=diameter(root);                                                                                                                         
        return rp.dia;
    }

    public TreePair diameter(TreeNode root){
        if(root==null){
            return new TreePair(0, -1);
        }
        TreePair left=diameter(root.left);
        TreePair right=diameter(root.right);
        
        TreePair result=new TreePair(Math.max(left.h+right.h+2,Math.max(right.dia,left.dia)),Math.max(left.h,right.h)+1);
        
        return result;
    }
}
