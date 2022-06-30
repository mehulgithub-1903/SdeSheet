

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
    public TreeNode deleteNode(TreeNode root, int key) {
    
        if(root==null) return null;
        if(root.val==key){
            root=solve(root);
            return root;
        }
        TreeNode dummy = root;

        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=solve(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.val==key){
                    root.right=solve(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }

        return dummy;

    }
    
    public TreeNode solve(TreeNode root){
        if(root.right==null){
            return root.left;
        }
        else if(root.left==null){
            return root.right;
        }
        TreeNode rightChild=root.right;
        TreeNode connect=nodeWithMaxVal(root.left);
        connect.right=rightChild;

        return root.left;
    }

    public TreeNode nodeWithMaxVal(TreeNode root){
        if(root.right==null){
            return root;
        }
        return nodeWithMaxVal(root.right);
    }
    
}
