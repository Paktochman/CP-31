import java.util.Scanner;

public class Dominoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        // Each domino covers 2 squares, so the maximum is total squares / 2
        int maxDominoes = (m * n) / 2;
        System.out.println(maxDominoes);
    }
}

