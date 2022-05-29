import java.util.*;

/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/


public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         TreeMap<Integer,int []> mp=new TreeMap<Integer,int []>();
         ArrayList<Integer> al=new ArrayList<Integer>();
        dfs(root,0,mp,0);
         for(Map.Entry<Integer,int []> e:mp.entrySet()){
            int s[]=e.getValue();
            al.add(s[1]);
         }
         return al;
    }
    public static void dfs(BinaryTreeNode root,int vl,TreeMap<Integer,int []> mp,int level){
        if(root==null) return;
        if(!mp.containsKey(vl)){
            mp.put(vl,new int[]{level,root.val});
        }else{
            int s[]=mp.get(vl);
            if(s[0]<=level){
                mp.put(vl,new int[]{level,root.val});
            }
        }
        dfs(root.left, vl-1, mp,level+1);
        dfs(root.right, vl+1, mp,level+1);

        return;
    }

}
