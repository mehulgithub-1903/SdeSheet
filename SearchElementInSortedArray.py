class Solution(object):
    def search(self, nums, target):
        l=0;
        h=len(nums)-1
        
        while(l<=h):
            m=l+(h-l)//2
            if nums[m]==target:
                return m
            else:
                if nums[m]>=nums[l]:
                    if(nums[l]<=target and nums[m]>target):
                        h=m-1
                    else:
                        l=m+1
                elif nums[m]<=nums[h]:
                    if nums[h]>=target and nums[m]<target:
                        l=m+1
                    else:
                        h=m-1
        return -1
       
        
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        