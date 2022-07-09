import java.util.LinkedList;
import java.util.Queue;


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
   public Node connect(Node root) {
    if(root==null) return null;
       Queue<Node> q=new LinkedList<>();
    q.add(root);
       
    while(!q.isEmpty()){
      int s=q.size();      
      int k=s-1;
      for (int i=0;i<s;i++){
         Node x=q.poll();
         if(k>0 && x!=null){
            x.next=q.peek();
            k--;
         }
         if(x.left!=null)q.add(x.left);
         if(x.right!=null)q.add(x.right);
      }
    }
    return root;   
   }
}
