

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
    class Pair{
        int nn;
        int rn;

        Pair(){

        }
        Pair(int nn,int rn){
            this.nn=nn;
            this.rn=rn;
        }
    }
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        return solve(root).nn;
    }
        public int maxi(int... arr)
        {
                int msf=arr[0];
                for(int e:arr) 
                        msf=Math.max(msf,e);
                return msf;
        }
    public Pair solve(TreeNode root){
        if(root==null){
                return new Pair(-10000,-10000);
        }
        Pair left=solve(root.left);
        Pair right=solve(root.right);

        int rtn=(Math.max(left.rn,right.rn)>0?Math.max(left.rn,right.rn):0)+root.val;
        int ntn=maxi(left.nn,right.nn,left.rn+right.rn+root.val,root.val,rtn);
        Pair result=new Pair(ntn,rtn);
        return result;
    }
}
