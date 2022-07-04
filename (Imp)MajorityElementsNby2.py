

class Solution(object):
    def majorityElement(self, nums):
        
        cnt=0
        candidate=0
        for x in nums:
            if cnt==0:
                candidate=x
            if x==candidate:cnt+=1
            else :cnt-=1             
            
        return candidate
