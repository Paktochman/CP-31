import java.util.*;

public class DivisibilityProblem {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a % b == 0) System.out.println(0);
            else System.out.println(b - (a % b));
        }
    }
}
