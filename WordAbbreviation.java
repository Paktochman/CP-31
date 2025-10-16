package CP31;

import java.util.Scanner;

public class WordAbbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of words
        sc.nextLine();          // consume remaining newline

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.length() > 10) {
                // create abbreviation
                String abbr = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbr);
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}

