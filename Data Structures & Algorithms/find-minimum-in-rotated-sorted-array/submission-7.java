class Solution {
    public int findMin(int[] nums) {
        
        if(nums[0] <= nums[nums.length - 1])
            return nums[0];

        if(nums.length == 2)
            return nums[0] < nums[1] ? nums[0] : nums[1];

        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;

        while(r >= l)
        {
            // min found
            if(mid != 0 && nums[mid] < nums[mid - 1])
                return nums[mid];

            // search right
            else if(nums[mid] > nums[nums.length - 1])
                l = mid + 1;

            // search left
            else
                r = mid - 1;

            mid = (l + r) / 2;
        }

        return -1;
    }
}
