class Solution {
    public String longestCommonPrefix(String[] strs) {
        int c=0;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        while(c<first.length())
        {
            if(first.charAt(c)==last.charAt(c))
            {
                c++;
            }
            else
            {
                break;
            }
        }
        return c==0?"":first.substring(0,c);
    }
}