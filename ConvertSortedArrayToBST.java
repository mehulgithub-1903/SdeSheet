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
   public TreeNode sortedArrayToBST(int[] nums) {
      return bst(nums, 0, nums.length-1);   
   }
   public TreeNode bst(int nums[],int i,int j){
      if(i>j) return null;
      if(i==j) return new TreeNode(nums[i],null,null);
      
      int mid=(i+j)/2;
      // if(i==mid) {
      //    TreeNode root=new TreeNode(nums[mid+1],null,null);
      // root.right=bst(nums, mid+1, j);
      // root.left=bst(nums, i, mid-1);

      // }
      TreeNode root=new TreeNode(nums[mid],null,null);
      root.right=bst(nums, mid+1, j);
      root.left=bst(nums, i, mid-1);
         return root;
   }
}
