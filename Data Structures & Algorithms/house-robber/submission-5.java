class Solution {
    public int rob(int[] nums) {
        int[] profit = new int[nums.length];

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        //if(nums.length == 2) return nums[0] > nums[1] ? nums[0] : nums[1];

        profit[0] = nums[0];
        profit[1] = nums[0] > nums[1] ? nums[0] : nums[1];

        int profitWithCurr;
        int profitWithout;

        for(int i = 2; i < nums.length; ++i)
        {
            profitWithCurr = nums[i] + profit[i - 2];
            profitWithout = profit[i - 1];
            
            profit[i] = profitWithCurr >= profitWithout ? profitWithCurr : profitWithout;
        }

        return profit[profit.length - 1];
    }

    // public int getMax(int[] arr)
    // {
    //     //int currMax;
    //     int max = 0;

    //     for(int i = 0; i < arr.length; ++i)
    //     {
    //         if(arr[i] > max)
    //             max = arr[i];
    //     }

    //     return max;
    // }
}
