def slidingWindowMaximum(nums:list, k:int):
    q=[]
    ans=[]
    id=0
    for i in range(k):
        q.append(nums[i])
    
    ans.append(max(q))
    id+=1
    for i in range(k,len(nums)):
        q.pop(0)
        q.append(nums[i])
        ans.append(max(q))

    return ans
    pass
