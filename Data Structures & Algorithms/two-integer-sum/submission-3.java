class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int compliment;

        for(int i = 0; i < nums.length; ++i)
        {
            compliment = target - nums[i];

            if(map.containsKey(compliment))
            {
                return new int[] {map.get(compliment),i};
            }

            else 
            {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
