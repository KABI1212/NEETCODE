
public class append {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        int result = t.length() - j;
        System.out.println("Characters to append: " + result);
    }
}