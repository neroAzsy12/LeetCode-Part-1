class Solution:
    def twoSum(self, nums, target):
        compliment = {}                 # declare a dictionary that will map nums[index] to index
        for i, num in enumerate(nums):  # i is index, num is the value
            tmp = target - num
            if tmp in compliment:
                return [i, compliment[tmp]]
            compliment[num] = i