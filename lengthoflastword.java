public class lengthoflastword{
    public static void main(String[] args) {
        String s = "Hello World";

        int length = 0, i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                while (i < s.length() && s.charAt(i) == ' ') {
                    i++;
                }
                if (i == s.length()) {
                    System.out.println("Length of last word: " + length);
                    return;
                }
                length = 0;
            } 
            else {
                length++;
                i++;
            }
        }

        System.out.println("Length of last word: " + length);
    }
}