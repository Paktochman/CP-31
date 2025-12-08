import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of rooms
        int count = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // people already in room
            int q = sc.nextInt(); // total capacity

            if (q - p >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}

