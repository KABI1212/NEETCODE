import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int houses = 0;
        for (char c : s.toCharArray()) {
            if (c == 'H') houses++;
        }

        if (houses <= 1) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        String result = "";
        for (char c : s.toCharArray()) {
            if (c == '.') result += 'B';
            else result += 'H';
        }

        System.out.println(result);
    }
}