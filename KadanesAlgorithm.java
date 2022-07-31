public class KadanesAlgorithm {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(current, max);
        }
        return max;
    }
}
