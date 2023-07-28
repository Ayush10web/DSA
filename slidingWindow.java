public class slidingWindow {
    public static void main(String[] args) {
        int[] nums = { 1, 2000, 30, 1000 };
        int sum = 0;
        int k = 2;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
