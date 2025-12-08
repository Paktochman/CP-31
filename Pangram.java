import java.util.*;

public class Pangram {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next().toLowerCase();

        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

