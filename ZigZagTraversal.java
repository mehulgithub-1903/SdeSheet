import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;



class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
             
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();

        int z=0;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<Integer> al=new ArrayList<Integer>();
                for(int i=0;i<s;i++) al.add(0);
            
            for(int i=0;i<s;i++){
                TreeNode x=q.poll();
                int index=(z==1?s-1-i:i);
                al.set(index,x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
           
            
                ans.add(al);          
                z=1-z;
        }

        return ans;

    }
}
