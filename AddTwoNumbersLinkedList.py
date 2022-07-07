# # Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        sum=0
        carry=0
        temp=l1
        while l1.next!=None and l2.next!=None:
            sum=l1.val+l2.val+carry
            carry=sum/10
            # print(sum,carry)
            l1.val=sum%10
            l1=l1.next
            l2=l2.next
        
        sum=l1.val+l2.val+carry
        carry=sum//10
        # print(sum,carry)
        l1.val=sum%10
        
        if l1.next!=None:
            l1=l1.next
            while l1.next!=None:
                sum=l1.val+carry
                carry=sum/10
                l1.val=sum%10
                l1=l1.next
            sum=l1.val+carry
            carry=sum/10
            l1.val=sum%10
            if carry!=0:
                nn=ListNode(carry,None);
                l1.next=nn;
            
        elif l2.next!=None:
            l1.next=l2.next
            l2=l2.next
            while l2.next!=None:
                sum=l2.val+carry
                carry=sum/10
                l2.val=sum%10
                l2=l2.next
            sum=l2.val+carry
            carry=sum/10
            l2.val=sum%10
            if carry!=0:
                nn=ListNode(carry,None);
                l2.next=nn;
        else:
            if carry!=0:
                nn=ListNode(carry,None);
                l1.next=nn;
        return temp
     
        
            
            
         
