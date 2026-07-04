class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum = nums[0];
        int Currsum = 0;
        for(int i=0;i<nums.length;i++){
            Currsum = Math.max(Currsum+nums[i],nums[i]);
            Maxsum = Math.max(Currsum,Maxsum);
        }
        return Maxsum;
    }
}