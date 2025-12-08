import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        // Use a set to count distinct characters
        Set<Character> distinctChars = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }

        // Check if the number of distinct characters is odd or even
        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
