public class replace {

    public static void replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int rightMax = -1;
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            ans[i] = rightMax;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
    }
}