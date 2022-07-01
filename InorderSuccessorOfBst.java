class Solution
{
  int succ=Integer.MAX_VALUE;
  Node ans=null;
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
            inos(root, x);
            return ans;
         }
         public void inos(Node root, Node x){
          if(root.data<=x.data) return inos(root.right, x);
          else {
            if(root.data<succ) ans=root; 
            inos(root.left, x);
          } 
         }
         
}
