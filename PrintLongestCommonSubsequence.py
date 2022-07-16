

class Solution(object):
    dp=[] 
    def helper(self,i,j ,text1, text2):
            if i==len(text1):return 0
            if j==len(text2):return 0
            if self.dp[i][j]!=None:return self.dp[i][j]
            
            if text1[i]==text2[j]:
                self.dp[i][j]=1+self.helper(i+1,j+1,text1,text2))
                
            else:
                self.dp[i][j]=max(self.helper(i+1,j,text1,text2),self.helper(i,j+1,text1, text2))
            
            return self.dp[i][j]
    def longestCommonSubsequence(self, text1, text2):
        self.dp=[[None for x in range(len(text1)+1)] for y in range(len(text2)+1)]
        
        self.helper(0,0,text1, text2)
        i=len(text1)
        j=len(text2)
        ans=""
        while i>0 and j>0:
            if text1[i-1]==text2[j-1]:
                j-=1
                i-=1
                ans+=text1[i-1]
            else:
                if self.dp[i][j-1]>self.dp[i-1][j]:
                    j-=1
                else:
                    i-=1
        return ans
    
                


        # for i in range(len(dp)):
        #     dp[i][0]=0
        # for j in range(len(dp[0])):
        #     dp[0][j]=0
        
        # for i in range(1,len(dp)):
        #     for j in range(1,len(dp[0])):
        #         if  text1[j]==text2[i]:
        #             dp[i][j]=1+dp[i-1][j-1]
        #         else:
        #             max(dp[i-1][j],dp[i][j-1])
        
        # return dp[len(dp)-1][len(dp[0])-1]
    
        
