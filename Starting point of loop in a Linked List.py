

class Solution(object):
    def detectCycle(self, head):
        
        s = head
        f = head
        x=head
        if f==None or f.next==None or f.next.next==None:return None
        while(f.next!=None and f.next.next!=None):
            s=s.next;
            f=f.next.next;
            if s==f:
                while x!=s:
                    x=x.next
                    s=s.next
                return s
        
        return None
