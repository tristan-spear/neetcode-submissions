class Solution {
public:
    int hammingWeight(uint32_t n) 
    {
        int ctr = 0;
        //unsigned int bit = 1;

        for(int i = 0; i < 32; ++i)
        {
            if((1 << i) & n)
            {
                ++ctr;
            }
        }

        return ctr;
    }
};
