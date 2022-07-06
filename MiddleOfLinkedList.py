# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        t=head
        m=head
        while t.next!=None and t.next.next!=None:
            t=t.next.next
            m=m.next
        
        if t.next!=None and t.next.next==None:
            return m.next
        else:
            return m
        
