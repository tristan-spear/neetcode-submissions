class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs.size());
        sb.append('#');
        for(int i = 0; i < strs.size(); ++i) {
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> lst = new ArrayList<>();
        String charLen = "";
        String numStringTemp = "";
        int numStrings;
        int currStringLen;
        //String currString = "";
        int charItr = 0;

        // get number of strings in list
        while(str.charAt(charItr) != '#') {
            numStringTemp += str.charAt(charItr++);
        }
        charItr++;
        numStrings = Integer.parseInt(numStringTemp);
        numStringTemp = "";

        for(int i = 0; i < numStrings; ++i) {

            String currString = "";

            // get length of current string
            while(str.charAt(charItr) != '#') {
                numStringTemp += str.charAt(charItr++);
            }
            currStringLen = Integer.parseInt(numStringTemp);
            numStringTemp = "";
            charItr++;
            
            while(currStringLen-- > 0) {
                currString += str.charAt(charItr++);
            }
            lst.add(currString);
        }

        return lst;
    }
}
