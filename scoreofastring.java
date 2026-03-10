public class scoreofastring {

    public static void scoreOfString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        scoreOfString("hello");
    }
}