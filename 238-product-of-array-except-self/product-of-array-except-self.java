class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 1;
        int l = 1;
        for(int i=0;i<nums.length;i++){
            arr[i] = k;
            k*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            arr[j]*= l;
            l*=nums[j];
        }
        return arr;
    }
}