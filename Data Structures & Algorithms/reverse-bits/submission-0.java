class Solution {
    public int reverseBits(int n) {
        
        int reversed = 0;

        for(int i = 0; i < 32; ++i)
        {
            if((1<<i & n) != 0)
            {
                reversed = reversed | (1<<(31-i));
            }
        }

        return reversed;
    }
}
