class Solution(object):
    def findDuplicate(self, nums):
        
        for i in range(len(nums)):
           if nums[abs(nums[i])]<0:
               return abs(nums[i])
           else:
               nums[abs(nums[i])]=nums[abs(nums[i])]*-1
        
        return 0
           
                
                
