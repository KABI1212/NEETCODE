import java.util.HashSet;
class duplicateinteger {
    public static void hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                System.out.println(true);
                return;
            }
            set.add(n);
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        hasDuplicate(nums);
    }
}