class Solution {
    public int[] countBits(int n) {
        
        int[] output = new int[n+1];

        for(int i = 0; i < n+1; ++i)
        {
            output[i] = getNumBits(i);//Integer.bitCount(i);
        }

        return output;
    }

    public int getNumBits(int num)
    {
        int count = 0;
        for(int i = 0; i < 32; ++i)
        {
            if((1<<i & num) != 0)
                count++;
        }

        return count;
    }
}
