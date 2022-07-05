class Solution(object):
    def factorial(self,m):
        ans=1
        for i in range(1,m+1):
            ans=ans*i
        return ans
    def uniquePaths(self, m, n):
        m-=1
        n-=1
        a=self.factorial(m)
        b=self.factorial(n)
        c=self.factorial(m+n)
        return c//(a*b)
    
        
        
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        
