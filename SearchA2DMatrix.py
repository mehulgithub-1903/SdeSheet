class Solution(object):
    def searchMatrix(self, matrix, target):
        
        n=len(matrix)
        m=len(matrix[0])
        l=0
        h=n*m-1
        
        while l<=h:
            mid=l+(h-l)//2
            
            if matrix[mid/m][mid%m]==target:
                return True
            elif matrix[mid/m][mid%m]<target:
                l=mid+1
            elif matrix[mid/m][mid%m]>target:
                h=mid-1
        
        return False;

                
    
        
        
