import java.util.Scanner;

public class IT24104078Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double quantity = scanner.nextDouble();

        double totalAmount = pricePerKg * quantity;

        System.out.printf("Amount to pay: %.2f\n", totalAmount);
    }
}
