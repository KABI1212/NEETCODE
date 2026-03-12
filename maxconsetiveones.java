
public class maxconsetiveones {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        int n = nums.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == 0)
                    break;
                cnt++;
            }

            res = Math.max(res, cnt);
        }

        System.out.println("Maximum Consecutive Ones: " + res);
    }
}