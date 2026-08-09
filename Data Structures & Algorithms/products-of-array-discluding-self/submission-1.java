class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] output = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        prefix[i] = 1;
        suffix[j] = 1;
        

        // get prefixes and suffixes
        while(i < nums.length - 1 && j >= 0)
        {
            prefix[++i] = prefix[i-1] * nums[i-1];
            suffix[--j] = suffix[j+1] * nums[j+1];
        }

        for(int t = 0; t < output.length; ++t)
            output[t] = prefix[t] * suffix[t];

        return output;
    }
}  
