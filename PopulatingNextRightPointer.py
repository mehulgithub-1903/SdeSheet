"""
# Definition for a Node.
"""
# class Node(object):
#     def __init__(self, val=0, left=None, right=None, next=None):
#         self.val = val
#         self.left = left
#         self.right = right
#         self.next = next

from collections import deque
class Solution(object):
    def connect(self, root):

        if root==None:return None
        curr=root
        newLevelStart=Node()
        while curr.left!=None:
            newLevelStart=curr.left
            
            while curr!=None:
                curr.left.next=curr.right
                curr.right.next=(None if curr.next==None else curr.next.left)
                curr=curr.next
            
            curr=newLevelStart
    
        return root
                
                
                    
        
