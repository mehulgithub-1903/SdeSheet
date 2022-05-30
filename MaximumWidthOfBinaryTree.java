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
        static class Pair{
        TreeNode node;
        int index;

        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
      if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();        
        q.add(new Pair(root,0));
        int maxWidth=0;
        while(!q.isEmpty()){
            int s=q.size();
            int start=q.peek().index;
            int end=q.peek().index;
            for(int i=0;i<s;i++){
                Pair x=q.poll();
                end=x.index;
                if(x.node.left!=null) q.add(new Pair(x.node.left,2*x.index+1));
                if(x.node.right!=null)q.add(new Pair(x.node.right,2*x.index+2));
                
            }
            maxWidth=Math.max(end-start+1,maxWidth);

        }
        return maxWidth;
    }
}
