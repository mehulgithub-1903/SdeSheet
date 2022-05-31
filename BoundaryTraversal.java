/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> traverseBoundary(TreeNode root){

        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        al.add(root.data);
        leftBoundary(root.left, al);
        addLeaves(root.left, al);
        addLeaves(root.right, al);
        rightBoundary(root.right, al);

        return al;

    }
    public static void leftBoundary(TreeNode root,ArrayList<Integer> al){
        if(root==null) return;

        if(!isLeaf(root))al.add(root.data);
        if(root.left!=null) leftBoundary(root.left, al);
        else leftBoundary(root.right, al);
    
    }
    public static void rightBoundary(TreeNode root,ArrayList<Integer> al){
        if(root==null) return;
        if(root.right!=null) rightBoundary(root.right, al);
        else rightBoundary(root.left, al);
        if(!isLeaf(root)) al.add(root.data);
    }

    public static boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null) return true;

        return false;

    }
    public static void addLeaves(TreeNode root,ArrayList<Integer>al){
        if(root==null) return;
        if(isLeaf(root)) 
        {
            al.add(root.data);
            return;
        }
        addLeaves(root.left, al);
        addLeaves(root.right, al);

        
    }
    

}
