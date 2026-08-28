class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        compliment = 0

        for i, n in enumerate(nums):
            hm[n] = i

        for i, n in enumerate(nums):
            compliment = target - n

            if compliment in hm and hm[compliment] != i:
                j = hm[compliment]
                return [i, j] if i < j else [j, i]
# python solution