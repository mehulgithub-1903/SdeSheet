
class Solution(object):
    def bstFromPreorder(self, preorder):
        if len(preorder)==0:return None
        if len(preorder) ==1:return TreeNode(preorder[0],None,None);
        root=TreeNode(preorder[0],None,None);
        
        lpre=[x for x in preorder if x<preorder[0]]
        rpre=[x for x in preorder if x>preorder[0]]
        l=self.bstFromPreorder(lpre)
        r=self.bstFromPreorder(rpre)
        
        root.left=l
        root.right=r
        return root        
        
