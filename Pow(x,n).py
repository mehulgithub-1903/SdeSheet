class Solution(object):
    def myPow(self, x, n):
        if n<0:
            x=1/x
            n=n*-1
        ans=1.0000
        while n:
            if n%2==0:
                x=x*x
                n=n//2
            else:
                ans*=x
                n=n-1
        
        return ans          
        
