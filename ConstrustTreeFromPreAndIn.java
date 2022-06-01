import java.util.ArrayList;

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        for(int e:preorder) pre.add(e);
        for(int e:inorder) in.add(e);
        
        return solve(pre, in);
    }
    public TreeNode solve(ArrayList<Integer> pre,ArrayList<Integer> in){
        if(pre.size()==0) return null;
        if(pre.size()==1) return new TreeNode(pre.get(0));
        TreeNode root=new TreeNode();
        root.val=pre.get(0);
        ArrayList<Integer> leftpre=new ArrayList<>();
        ArrayList<Integer> leftin=new ArrayList<>();
        ArrayList<Integer> rightpre=new ArrayList<>();
        ArrayList<Integer> rightin=new ArrayList<>();
        int i=0;
        while(in.get(i)!=root.val){
            leftin.add(in.get(i));
            i++;
        }
        i++;
        while(i<in.size()){
            rightin.add(in.get(i));
            i++;
        }
        int j=1;
        while(j<pre.size() && leftpre.size()!=leftin.size()){
            leftpre.add(pre.get(j));
            j++;
        }
        
        while(j<pre.size() && rightpre.size()!=rightin.size()){
            rightpre.add(pre.get(j));
            j++;
        }

//         System.out.println(leftpre);
//         System.out.println(leftin);
//         System.out.println(rightpre);
//         System.out.println(rightin);
        
        TreeNode left=solve(leftpre, leftin);
        TreeNode right=solve(rightpre, rightin);
        root.left=left;
        root.right=right;

        return root;

        

    }
}
