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
        
        return dp[len(dp)-1][len(dp[0])-1]
