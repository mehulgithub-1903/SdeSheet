/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> a1=new ArrayList<>();
        ArrayList<TreeNode> a2=new ArrayList<>();
          
        Solve(root,p,a1);
        Solve(root,q,a2);
        // for(TreeNode e:a1) System.out.println(e);
        //      System.out.println("Hello");
        // for(TreeNode e:a2) System.out.println(e);
        // System.out.println(a1.get(0)==a2.get(0));
             int i=0;
        while(i<Math.min(a1.size(),a2.size())){
            if(a1.get(i).val!=a2.get(i).val) break;
            i++;
        }

        return a1.get(i-1);

    }
    public static boolean Solve(TreeNode root,TreeNode target,ArrayList<TreeNode> al){
        
        if(root==null) return false;

        al.add(root);
        if(root==target) return true;

        if(Solve(root.left,target,al) || Solve(root.right,target,al)){
            return true;
        }
        al.remove(al.size()-1);
        return false;
    }
}
