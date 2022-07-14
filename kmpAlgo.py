class Solution(object):
    def kmpPreProcess(self,needle):
        res=[0]*len(needle)
        i=1
        j=0
        while i<len(needle):
            if needle[i]==needle[j]:
                i+=1
                j+=1
            elif j>0:
                j=res[j-1]
            else:
                res[i]=0
                i+=1
        return res
            
    def strStr(self, haystack, needle):
            i=0A
            j=0
            res=self.kmpPreProcess(needle)
            print(res)
            while i<len(haystack) and j<len(needle):
                if haystack[i]==needle[j]:
                    i+=1
                    j+=1
                elif j>0:
                    j=res[i-1]
                else:
                    i+=1
            
            return i-j if j==len(needle) else -1
        
                    
    
        
