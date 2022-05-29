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
    static class Pair{
        int val;
        int level;

        Pair(int val,int level){
            this.val=val;
            this.level=level;
        }
    }
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        if(root==null) return new ArrayList<Integer>();
        TreeMap<Integer,ArrayList<Pair>> mp=new TreeMap<>();
        ArrayList<Integer> al=new ArrayList<Integer>();
         
        dfs(root,0,mp,0);
         
        for(Map.Entry<Integer,ArrayList<Pair>> e:mp.entrySet()){
            ArrayList<Pair> temp=e.getValue();
            Collections.sort(temp,(Pair a,Pair b)->a.level-b.level);
            for(int i=0;i<temp.size();i++){
                al.add(temp.get(i).val);
            }
        }
         
        return al;
    }
     public static void dfs(TreeNode<Integer> root,int vl,TreeMap<Integer,ArrayList<Pair>> mp,int level){
        if(root==null) return;
        if(!mp.containsKey(vl)){
            mp.put(vl,new ArrayList<Pair>());
            mp.get(vl).add(new Pair(root.data,level));
        }
         else{
             mp.get(vl).add(new Pair(root.data, level));
         }

        dfs(root.left, vl-1, mp,level+1);
        dfs(root.right, vl+1, mp,level+1);

        return;
    }
}
