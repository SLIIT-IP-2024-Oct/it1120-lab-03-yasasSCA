import java.util.Scanner;

public class IT24104078Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        System.out.print("Separated digits: ");
        while (number > 0) {
            System.out.print(number / (int)Math.pow(10, (int)Math.log10(number)) + " ");
            number %= (int)Math.pow(10, (int)Math.log10(number));
        }
    }
}
