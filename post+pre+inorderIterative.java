

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
    class Pair{
        TreeNode node;
        int state;

        Pair(TreeNode node,int state){
            this.state=state;
            this.node=node;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null) return new ArrayList<Integer>();
        Stack<Pair> st=new Stack<Pair>();
        List<Integer> in =new ArrayList<Integer>();
        List<Integer> pre =new ArrayList<Integer>();
        List<Integer> post =new ArrayList<Integer>();
        //1-> add to pre,increase state,go to left;
        //2-> add to in,increase state,go to right;
        //3-> add to post,pop();
        st.push(new Pair(root,1));

        
        while(!st.isEmpty()){
            Pair x=st.peek();
{            if(x.state==1){
                pre.add(x.node.val);
                x.state=2;
                if(x.node.left!=null){
                    st.add(new Pair(x.node.left,1));
                }
            }
            else if(x.state==2){
                in.add(x.node.val);
                x.state=3;
                if(x.node.right!=null){
                    st.add(new Pair(x.node.right,1));
                }
            }else{
                post.add(x.node.val);
                st.pop();
            }
}        }

        return post;


    }
    // public void postorder(TreeNode root,List<Integer> al){

    //     if(root==null) return;
        
    //     postorder(root.left,al);
    //     postorder(root.right,al);
    //     al.add(root.val);
    //     return;
                                                          

    // }
}
