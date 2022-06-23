class Solution(object):
    def singleNonDuplicate(self, nums):
        if len(nums)==1:
            return nums[0]
        l=0;
        h=len(nums)-1
        
        while(l<=h):
            m=l+(h-l)//2
            if m!=0 and m!=len(nums)-1:
                if(nums[m-1]!=nums[m] and nums[m+1]!=nums[m]):
                    return nums[m]
            elif m==0:
                if(nums[m+1]!=nums[m]):return nums[m]
            elif m==len(nums)-1:
                if(nums[m-1]!=nums[m]):return nums[m]
            
            if m!=len(nums)-1 and nums[m+1]==nums[m]:
                if (len(nums)-m)%2==0:h=m-1
                else:l=m+2
                
            elif m!=0 and nums[m-1]==nums[m]:
                if (m+1)%2==0:
                    l=m+1
                else:
                    h=m-2
        """l=
        :type nums: List[int]
        :rtype: int
        """
        