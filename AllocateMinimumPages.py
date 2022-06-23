class Solution:
    def isPossible(self,a,books,students):
        sa=0
        k=0
        for i in range(len(a)):
            sa+=a[i]
            if(sa>books):
                k+=1
                sa=a[i]
                if sa>books:return False
        if k<students :return True
        else :return False        
                
    def findPages(self,a, n,m):
        if n<m :return -1
        l=min(a)
        h=sum(a)
        res=-1
        while l<=h:
            mid=l+(h-l)//2
            if(self.isPossible(a,mid,m)): 
                res=mid
                h=mid-1
            else:
                l=mid+1
        return res
