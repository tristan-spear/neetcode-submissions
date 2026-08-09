class Solution {
    public boolean isPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0;

        while(l <= r)
        {
            while(l < s.length() && !Character.isLetterOrDigit(s.charAt(l)))
                ++l;
            
            while(r >= 0 && !Character.isLetterOrDigit(s.charAt(r)))
                --r;

            if(l < s.length() && r >= 0  && Character.toUpperCase((s.charAt(l))) != Character.toUpperCase((s.charAt(r))))
                return false;

            ++l;
            --r;
        }
        return true;
    }
}
