
class Solution:
    #Function to check if the linked list has a loop.
    def detectLoop(self, head):
            s=head;
            f=head.next;
            if f!=None:f=f.next
            else:return False
            
            while s!=None and f!=None and s!=f:
                s=s.next
                f=f.next
                if f==None:
                    return False
                else:
                    f=f.next
            
            if s!=None and f!=None and s==f:return True
            else:return False
        
                    
