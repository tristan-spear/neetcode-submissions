class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.equals("")) return 0;

        Set<Character> hs = new HashSet<>();
        int currLength = 0;
        int max = 1;

        int left = 0;
        int right = 0;


        while(right != s.length())
        {

            if(hs.contains(s.charAt(right)))
            {
                while(hs.contains(s.charAt(right)))
                {
                    hs.remove(s.charAt(left));
                    ++left;
                }
            }
            hs.add(s.charAt(right));

            currLength = hs.size();
            if(currLength > max)
                max = currLength;

            ++right;
        }

        return max;
    }
}
