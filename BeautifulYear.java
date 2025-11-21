import java.util.*;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while (true) {
            y++;
            if (allDistinct(y)) {
                System.out.println(y);
                return;
            }
        }
    }

    static boolean allDistinct(int y) {
        String s = String.valueOf(y);
        boolean[] seen = new boolean[10];
        for (char c : s.toCharArray()) {
            if (seen[c - '0']) return false;
            seen[c - '0'] = true;
        }
        return true;
    }
}
