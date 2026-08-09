class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int frequency;
        ArrayList<Integer>[] frequencies = new ArrayList[nums.length];

        // initialize array of lists
        for(int i = 0; i < nums.length; ++i) {
            frequencies[i] = new ArrayList<Integer>();
        }

        // fill hashmap with key, value pairs
        for(int i = 0; i < nums.length; ++i) {
            
            frequency = 0;
            if(hm.containsKey(nums[i]))
                frequency = hm.get(nums[i]);

            hm.put(nums[i], ++frequency);
        }

        // fill list of arrays with values, in the index of their frequency
        for(int i = 0; i < nums.length; ++i) {

            if(hm.containsKey(nums[i])) {
                
                frequencies[hm.remove(nums[i]) - 1].add(nums[i]);
            }
        }

        // put top k most frequent values into output array
        int idx = frequencies.length - 1;
        for(int i = 0; i < k; ++i) { 
            
            idx = getHighestNums(frequencies, idx);


            if(frequencies[idx].size() > 1)
            {
                int j = 0;
                while((i + j) < k && j < frequencies[idx].size())
                {
                    output[i + j] = frequencies[idx].get(j);
                    ++j;
                }
                i = i + j - 1;
            }
            else
            {
                output[i] = frequencies[idx].get(0);
            }
            --idx;
        }

        return output;
    }

    // get the list with the highest frequencies, starting from idx
    private int getHighestNums(ArrayList<Integer>[] arr, int idx) {

        for(int i = idx; i >= 0; --i) {
            if(arr[i].size() > 0)
                return i;
        }
        return 0;
    }
}
