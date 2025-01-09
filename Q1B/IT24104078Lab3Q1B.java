import java.util.Scanner;

public class IT24104078Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double quantity = scanner.nextDouble();

        double totalAmount = pricePerKg * quantity;
        double discount = totalAmount * 0.10;
        double discountedAmount = totalAmount - discount;

        System.out.printf("Amount to pay after 10%% discount: %.2f\n", discountedAmount);
    }
}
