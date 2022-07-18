
class Solution(object):
    def shortestCommonSupersequence(self, str1, str2):
        dp=[[0 for cols in range(len(str1)+1)] for rows in range(len(str2)+1)]

        for i in range(len(dp)):
            dp[i][0]=i
        for j in range(len(dp[0])):
            dp[0][j]=j
        
        for i in range(1,len(dp)):
            for j in range(1,len(dp[0])):
                if str1[j-1]==str2[i-1]:
                    dp[i][j]=dp[i-1][j-1]+1
                else:
                    dp[i][j]=1+min(dp[i-1][j],dp[i][j-1])
        
        i=len(str2)
        j=len(str1)
        ans=str()
        while i>0 and j>0:
            if str1[j-1]==str2[i-1]:
                ans+=str1[j-1]
                i-=1
                j-=1
            else:
                if dp[i][j-1]<dp[i-1][j]:
                    ans+=str1[j-1]
                    j-=1
                else:
                    ans+=str2[i-1]
                    i-=1
        
        while i>0:
            ans+=str2[i-1]
            i-=1
        while j>0:
            ans+=str1[j-1]
            j-=1
        return ans[::-1] #reverse a string 
    
    
    
    
    
    
        

        
        
