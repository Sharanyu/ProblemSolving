class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int nums2[] = new int[len*2];
        for(int i=0;i<len;i++)
        {
            nums2[i] = nums[i];
            nums2[i+len] = nums[i];
        }
        return nums2;
}}