class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        compliment = 0

        for i, n in enumerate(nums):
            hm[n] = i

        for i, n in enumerate(nums):
            compliment = target - n

            if compliment in hm and hm[compliment] != i:
                t = hm[compliment]
                return [i, t] if i < t else [t, i]
# python solution