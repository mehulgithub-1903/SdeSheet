

class Solution(object):
    def removeNthFromEnd(self, head, n):
        s=ListNode()
        s.next=head
        fast=s
        slow=s
        
        for i in range(1,n+1):
            fast=fast.next
        prev=None
        while fast:
            fast=fast.next
            prev=slow
            slow=slow.next
        
        if(slow==head):return head.next
        prev.next=slow.next
        
        slow.next=None
        return head
    
