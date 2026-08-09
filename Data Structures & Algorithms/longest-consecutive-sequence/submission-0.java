class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> heads = new ArrayList<>();
        int maxSeq = 0;
        int currMax = 0;
        int curr; // sequence iterator

        // load whole array into hash set
        for(int n : nums)
            hs.add(n);
        
        for(int n : hs) {
            // find possible heads of sequences
            if(!hs.contains(n - 1)) {
                heads.add(n);
            }
        }

        // check the length of each sequence
        for(int n : heads) {
            currMax = 0;
            curr = n;
            
            while(hs.contains(curr)) {
                ++currMax;
                ++curr;
            }

            if(currMax > maxSeq)
                maxSeq = currMax;
        }
        return maxSeq;
    }
}
