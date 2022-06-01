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
    public TreeNode buildTree(int[] postorder, int[] inorder) {
        ArrayList<Integer> post=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        for(int e:postorder) post.add(e);
        for(int e:inorder) in.add(e);
        
        return solve(post, in);
    }
    public TreeNode solve(ArrayList<Integer> post,ArrayList<Integer> in){
        if(post.size()==0) return new TreeNode();
        if(post.size()==1) return new TreeNode(post.get(0));
        TreeNode root=new TreeNode();
        root.val=post.get(psot.get(post.size()-1));
        ArrayList<Integer> leftpost=new ArrayList<>();
        ArrayList<Integer> leftin=new ArrayList<>();
        ArrayList<Integer> rightpost=new ArrayList<>();
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
        int j=0;
        while(j<post.size()-1 && leftpost.size()!=leftin.size()){
            leftpost.add(post.get(j));
            j++;
        }
        while(j<post.size()-1 && rightpost.size()!=rightin.size()){
            rightpost.add(post.get(j));
            j++;
        }

        System.out.println(leftpost);
        System.out.println(leftin);
        System.out.println(rightpost);
        System.out.println(rightin);
        
        TreeNode left=solve(leftpost, leftin);
        TreeNode right=solve(rightpost, rightin);
        root.left=left;
        root.right=right;

        return root;

        

    }
}
