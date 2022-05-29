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

import java.util.*;

public class Solution 
{
    
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        
        ArrayList<Integer> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();

        q.add(root);

        while(!q.isEmpty()){
            int s=q.size();
            al.add(q.peek().val);
            for(int i=0;i<s;i++){
            TreeNode x=q.poll();
            if(x.left!=null) q.add(x.left);
            if(x.right!=null) q.add(x.right);
            }
        }
        return al;
    }
}
