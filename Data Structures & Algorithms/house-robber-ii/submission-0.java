class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0] >= nums[1] ? nums[0] : nums[1];

        int inclFirst = maxRob(nums, 0, nums.length - 1);
        int inclLast = maxRob(nums, 1, nums.length);

        return inclFirst >= inclLast ? inclFirst : inclLast;
    }

    public int maxRob(int[] nums, int start, int finish) {
        
        int[] profit = new int[nums.length - 1];
        int profItr = -1;
        profit[++profItr] = nums[start];
        profit[++profItr] = nums[start] > nums[start + 1] ? nums[start] : nums[start + 1];

        for(int i = start + 2; i < finish; ++i) {
            
            //int including = nums[i] + profit[profItr - 2]
            
            profit[++profItr] = (nums[i] + profit[profItr - 2]) >= (profit[profItr - 1]) ? (nums[i] + profit[profItr - 2]) : (profit[profItr - 1]);
        }
        return profit[profit.length - 1];
    }
}
