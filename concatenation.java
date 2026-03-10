    public class concatenation {

    public static void getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        getConcatenation(nums);
    }
}