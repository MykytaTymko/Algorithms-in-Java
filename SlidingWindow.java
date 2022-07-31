public class SlidingWindow {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int max = nums[0];
        int current = 0;
        for (int num : nums) {
            current = current + num;
            if (current > max)
                max = current;
            if (current < 0)
                current = 0;
        }
        return max;
    }
}
