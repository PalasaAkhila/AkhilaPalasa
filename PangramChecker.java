package codingassigment;

import java.util.Scanner;

public class PangramChecker {

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
