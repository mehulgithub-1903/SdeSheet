class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        size = len(nums)
        res = [-1] * size
        stack = []
        for i in range(0,size*2):
            while stack and (nums[stack[-1]] < nums[i%size]):
                res[stack.pop()] = nums[i%size]
            stack.append(i%size)
        return res
