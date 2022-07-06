class Solution(object):
    def lengthOfLongestSubstring(self, s):
        if len(s)==0:return 0
        if len(s)==1:return 1
        st=set()
        ans=0
        i,j=0,0
        mp={}
        while j<len(s):
            if i==j:
                mp[s[i]]=i
                j+=1
            else:
                if s[j] not in mp or mp[s[j]]<i:
                    mp[s[j]]=j
                    j+=1
                else:
                    
                    ans=max(ans,j-i)
                    i=mp[s[j]]+1
                    mp[s[j]]=j
                    j+=1
                    
        return max(ans,j-i)                   
        
