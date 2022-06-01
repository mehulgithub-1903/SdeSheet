class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return findSymmetric(root.left,root.right);
    }
    
    public boolean findSymmetric(TreeNode left,TreeNode right){
        
        if(left ==null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return findSymmetric(left.left,right.right) && 
               findSymmetric(left.right,right.left);
    }
}
