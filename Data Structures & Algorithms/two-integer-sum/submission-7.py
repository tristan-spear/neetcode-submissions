class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        compliment = 0

        for i, n in enumerate(nums):
            hm[n] = i

        for i, n in enumerate(nums):
            compliment = target - n

            if compliment in hm and hm[compliment] != i:
                w = hm[compliment]
                return [i, w] if i < w else [w, i]
# python solution