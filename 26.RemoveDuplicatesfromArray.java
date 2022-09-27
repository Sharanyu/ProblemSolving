class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        HashMap map = new HashMap();
        
        map.put(nums[0],1);
        
        for(int i=1;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                continue;
            }
            else
            {
                map.put(nums[i],1);
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}