import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int d = nums[0] * nums[1] * nums[n - 1];
        return Math.max(c, d);
    }
}
