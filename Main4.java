import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // test cases

        while (t-- > 0) {

            int g = sc.nextInt(); // green cost
            int p = sc.nextInt(); // purple cost

            int n = sc.nextInt(); // participants

            int p1 = 0, p2 = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == 1) p1++;
                if (b == 1) p2++;
            }

            int cost1 = p1 * g + p2 * p; // problem1 green
            int cost2 = p1 * p + p2 * g; // problem1 purple

            System.out.println(Math.min(cost1, cost2));
        }
    }
}