class Solution {
    public int lengthOfLastWord(String s) {
        int counter=0;
        int len = s.length();
        for(int i=len-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                counter++;
            }
            else
            {
                if(counter>0)
                {
                    return counter;
                }
            }
        }
        return counter;
    }
}