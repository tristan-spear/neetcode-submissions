class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()){return false;}

        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); ++i)
        {

            if(hm.containsKey(Character.toLowerCase(s.charAt(i))))
                hm.put(Character.toLowerCase(s.charAt(i)), hm.get(Character.toLowerCase(s.charAt(i))) + 1);
            
            else
                hm.put(Character.toLowerCase(s.charAt(i)), 1);
        }

        for(int i = 0; i < t.length(); ++i)
        {
            if(!(hm.containsKey(Character.toLowerCase(t.charAt(i))))){return false;}

            if(hm.get(Character.toLowerCase(t.charAt(i))) > 1)
                hm.put(Character.toLowerCase(t.charAt(i)), hm.get(Character.toLowerCase(t.charAt(i))) - 1);
            else
                hm.remove(Character.toLowerCase(t.charAt(i)));
        }

        return true;
    }
}
