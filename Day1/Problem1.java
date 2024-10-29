class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        StringBuilder res= new StringBuilder();
        int maxlength = Math.max(w1,w2);
        for(int i =0 ; i<maxlength ; i++)
        {
            if(i<w1)
            {
                res.append(word1.charAt(i));
            }
            if(i<w2)
            {
                res.append(word2.charAt(i));
            }
        } 
        return res.toString();
    }
}
