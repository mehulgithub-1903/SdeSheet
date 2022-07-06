# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        if list1==None :return list2
        if list2==None: return list1

        if list1.val>=list2.val:
            temp=list1
            list1=list2
            list2=temp
            
        temp =ListNode()
        temp=list1
        while list1!=None and list2!=None:
            prev=list1
            while list1!=None and list1.val<=list2.val:
                prev=list1
                list1=list1.next
            prev.next=list2
            
            k=list1
            list1=list2
            list2=k

        return temp
            
        
