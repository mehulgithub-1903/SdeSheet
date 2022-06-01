/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        int a=solve(node, x);
        if(a==Integer.MAX_VALUE){
            return -1;
        }else{
            return a;
        }
    }
    public static int solve(TreeNode<Integer> node, int x){
        if(node==null) return Integer.MAX_VALUE;
        if(node.left==null && node.right==null) {
        
        if(node.data>=x)  return node.data;
        return Integer.MAX_VALUE;
        }
            if(node.data>=x){
            int k=solve(node.left, x);
            return Math.min(k,node.data);
        }

        return solve(node.right, x);
    }
    
    
}
