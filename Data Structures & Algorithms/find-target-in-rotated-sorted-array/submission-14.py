class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        low = 0
        high = len(nums) - 1
        mid = (low + high) // 2

        while low < high and nums[mid] != target:

            if target > nums[mid]:
                # search left case
                if nums[0] > nums[mid] and nums[-1] < target:
                    high = mid-1
               
                # search right case
                else:
                    low = mid+1

            else: # target < nums[mid]
                # search right case
                if nums[-1] < nums[mid] and nums[0] > target:
                    low = mid + 1
                
                # search left case
                else:
                    high = mid - 1

            mid = (low + high) // 2

        return mid if nums[mid] == target else -1