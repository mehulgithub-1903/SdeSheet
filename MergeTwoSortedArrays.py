class Solution(object):
    def merge(self, nums1, m, nums2, n):
        i=0
        j=0
        result=[None]*(m+n)
        id=0    
        # [1,2,3,0,0,0]
        # 3
        # [2,5,6]
        # 3
        
        while i<m and j<n:
            if nums1[i]<=nums2[j]:
                result[id]=nums1[i]
                i+=1
                id+=1
            else:
                result[id]=nums2[j] 
                id+=1
                j+=1
        
        
        while i<m:
            result[id]=nums1[i]
            i+=1
            id+=1
        while j<n:
            result[id]=nums2[j]
            j+=1
            id+=1
        
        for i,x in enumerate(result):nums1[i]=x
            
                  
            
