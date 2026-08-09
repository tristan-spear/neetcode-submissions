class Solution {
    public int[] countBits(int n) {
        
        int[] output = new int[n+1];

        for(int i = 0; i < n+1; ++i)
        {
            output[i] = Integer.bitCount(i);
        }

        return output;
    }

    //public int getNumBits()
}
