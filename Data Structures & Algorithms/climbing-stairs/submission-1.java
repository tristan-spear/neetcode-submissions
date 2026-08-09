class Solution {
    public int climbStairs(int n) {
        
        return climbHelper(0, n);
    }

    public int climbHelper(int curr, int target)
    {
        if(curr > target)
            return 0;
        
        else if(curr == target)
            return 1;
        
        else
            return climbHelper(curr + 1, target) + climbHelper(curr + 2, target);
    }
}
