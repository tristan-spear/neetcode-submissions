class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        list.sort(nums)
        output = []
        target: int
        l: int
        r: int

        for i in range(len(nums) - 2):
            
            #skip duplicates
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            target = -1 * nums[i]
            l = i + 1
            r = len(nums) - 1
            sum = nums[l] + nums[r]

            while l < r:
                
                if sum < target:
                    l += 1
                
                elif sum > target:
                    r -= 1
                
                else:
                    output.append([nums[i], nums[l], nums[r]])
                    l += 1
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                
                sum = nums[l] + nums[r]

        return output