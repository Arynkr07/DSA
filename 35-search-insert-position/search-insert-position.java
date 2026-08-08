class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length-1;
        int i =0;
        while(i<=n){
            int mid = i + (n-i)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                i = mid+1;
            }
            else {
                n = mid-1;
            }
        }
        return i;
    }
}