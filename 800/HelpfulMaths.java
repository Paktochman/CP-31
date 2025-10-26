import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // Split the input by '+' and convert to integers
        String[] numbers = input.split("\\+");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        // Sort the numbers
        Arrays.sort(nums);

        // Print them in sorted order with '+'
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) System.out.print("+");
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}

