# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# solution by direct checking every node to be the intersection -o(n^2) and space o(1)
# solutin by hashing to check the first common node in both the linkedlists O(n) and space(o(n))
# solutin by differece in lengths of linkedList time o(n) +o(n) +o(n) space o(1)
# solutin by swapping dummy pointers as they hit null time O(2*max(length of list1,length of list2)) space(o(1))

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        d1=headA
        d2=headB
        while d1!=d2:
            d1=headB if d1==None else d1.next
            d2=headA if d2==None else d2.next
                
        
        return d1
    
