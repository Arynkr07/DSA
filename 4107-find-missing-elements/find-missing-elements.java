class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        List<Integer> arr = new ArrayList<>();

        if(nums.length == 0) return arr;
        for(int i = 0;i<n;i++){
            if(min != nums[i]){
                arr.add(min);
                i--;
            }
            min+= 1;
        }

        return arr;
    }
}