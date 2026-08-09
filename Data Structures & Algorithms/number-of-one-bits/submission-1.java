class Solution {
    public int hammingWeight(int n) {
        
        int ctr = 0;
        //unsigned int bit = 1;

        for(int i = 0; i < 32; ++i)
        {
            if(((1 << i) & n) != 0)
            {
                ++ctr;
            }
        }

        return ctr;
        
    }
}
