import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder rev = new StringBuilder(s).reverse();
        System.out.println(rev.toString().equals(t) ? "YES" : "NO");
    }
}
