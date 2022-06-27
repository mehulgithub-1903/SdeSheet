class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        
        mp={}
        st=[]
        st.append(nums2[0])
        for i in range(1,len(nums2)):
            if nums2[i]>st[len(st)-1]:
                while len(st)!=0 and nums2[i]>st[-1] :  
                    mp[st.pop()]=nums2[i]
            
            st.append(nums2[i])
        
        ans=[None]*len(nums1)
        for i in range(len(nums1)):
            if(nums1[i] not in mp):ans[i]=-1
            else:ans[i]=mp[nums1[i]]
        return ans        
    
