class Solution:
    def maxLen(self, n, arr):
        mp={}
        mp[arr[0]]=1
        sum=0
        maxi=0
        for i in range(1,len(arr)):
            sum+=arr[i]
            if sum==0:
                maxi=max(maxi,0)
            else:
                if sum in mp:
                    maxi=max(maxi,i-mp[sum]+1)
                else:
                    mp[sum]=i
        return maxi
            
         
