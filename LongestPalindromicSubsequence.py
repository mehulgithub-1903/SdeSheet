class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        dp=[[0 for x in range(len(text1)+1)] for y in range(len(text2)+1)]
        
        for i in range(len(dp)):
            dp[i][0]=0
        for j in range(len(dp[0])):
            dp[0][j]=0
        
        for i in range(1,len(dp)):
            for j in range(1,len(dp[0])):
                if  text1[j-1]==text2[i-1]:
                    dp[i][j]=1+dp[i-1][j-1]
                else:
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1])
        
        return dp[len(dp)-1][len(dp[0])-1]
    
            
        
    def longestPalindromeSubseq(self, s):
        a=s[::-1]
        return self.longestCommonSubsequence(a,s)
    
