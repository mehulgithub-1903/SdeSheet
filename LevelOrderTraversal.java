import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<s;i++){
                TreeNode x=q.poll();
                al.add(x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
            ans.add(al);

        }

        return ans;
    }
}
