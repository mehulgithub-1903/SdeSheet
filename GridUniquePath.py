def uniquePaths(m, n):
    # dp=[[0 for i in range(n)] for j in range(m)]
    
    prev=[0]*n
    
    for i in range(m):
        curr=[0]*n
        for j in range(n):
            if i==0 and j==0: 
                curr[j]=1
                continue
            up=0
            left=0
            up=prev[j]
            if j>0 :left=curr[j-1]
            curr[j]=up+left
        prev=curr
    return prev[n-1]
    pass
