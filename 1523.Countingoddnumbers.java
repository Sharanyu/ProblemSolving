class Solution {
    public int countOdds(int low, int high) {
        int COUNTER=0;
        if(high==low)
        {
            COUNTER=0;
        }
        else
        {
            COUNTER = ((high-low)/2);
        }
        if(high%2!=0 || low%2!=0)
        {
            COUNTER++;
        }
        return COUNTER;
    }
}