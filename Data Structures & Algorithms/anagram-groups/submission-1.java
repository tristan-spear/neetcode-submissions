class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int currentIntVal;
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0; i < strs.length; ++i)
        {
            String current = strs[i];
            int[] charFreq = new int[26];
                
            for(int j = 0; j < current.length(); ++j)
            {
                currentIntVal = Character.toUpperCase(current.charAt(j)) - 65; // get 0-25 value from current char
                ++charFreq[currentIntVal];
            }

            List<String> anagrams;
            String key = Arrays.toString(charFreq);

            if(hm.containsKey(key))
                anagrams = hm.get(key);

            else
                anagrams = new ArrayList<>();
            
            anagrams.add(current);

            hm.put(key , anagrams);
        }

        List<List<String>> output = new ArrayList<>();
        output.addAll(hm.values());

        return output;
    }
}