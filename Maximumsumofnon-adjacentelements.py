def maximumNonAdjacentSum(a):
    n=len(a)
#     dp=[0]*n
#     dp[0]=a[0]
    prev1=a[0]
    prev2=0
#     curr=a[0]
    for i in range(1,n):
       
        take = a[i]
        if i>1:take+=prev2
        nt=prev1
        curr=max(take,nt)
        
        prev2=prev1
        prev1=curr
    return prev1
