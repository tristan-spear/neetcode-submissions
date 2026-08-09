class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); ++i)
        {

            switch(s.charAt(i))
            {
                case ')':
                    if(st.isEmpty() || st.pop() != '(')
                        return false;
                    break;
                
                case ']':
                    if(st.isEmpty() || st.pop() != '[')
                        return false;
                    break;

                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
                
                default: 
                    st.push(s.charAt(i));
                    break;
            }
        }

        return st.isEmpty();
    }
}
