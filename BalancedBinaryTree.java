

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
        boolean hb;//isHeightBalanced
        int h;//height

        public TreePair(boolean hb,int h){
            this.hb=hb;
            this.h=h;
        }
    }
    public boolean isBalanced(TreeNode root) {
        TreePair rp=balanced(root);                                                                                                                         
        return rp.hb;
    }

    public TreePair balanced(TreeNode root){
       if(root==null){
           return new TreePair(true, -1);
       }
       TreePair left=balanced(root.left);
       TreePair right=balanced(root.right);

       TreePair result=new TreePair(left.hb && right.hb &&(Math.abs(left.h-right.h)<=1),Math.max(left.h,right.h)+1);

       return result;

    }
}
