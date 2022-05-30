/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> al=new ArrayList<>();

            Solve(A,B,al);
            return al;
    }
     public static boolean Solve(TreeNode root,int target,ArrayList<Integer> al){
        
        if(root==null) return false;

        al.add(root.val);
        if(root.val==target) return true;

        if(Solve(root.left,target,al) || Solve(root.right,target,al)){
            return true;
        }
        al.remove(al.size()-1);
        return false;
    }
}
