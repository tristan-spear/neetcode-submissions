class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> map = new HashMap<>();

        int temp = 0;

        for(int i = 0; i < t.length(); ++i)
        {
            temp = map.getOrDefault(t.charAt(i), 0);
            map.put(t.charAt(i), ++temp);
        }

        for(int i = 0; i < s.length(); ++i)
        {
            temp = map.getOrDefault(s.charAt(i), 0);

            if(temp == 0)
                return false;

            else if(temp == 1)
                map.remove(s.charAt(i));
            
            else 
                map.put(s.charAt(i), --temp);
        }

        return true;
    }
}
