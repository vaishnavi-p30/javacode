import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            Double.parseDouble(input);
            System.out.println("Valid number");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}

