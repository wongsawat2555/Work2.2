
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the card type (silver, gold, platinum): ");
        String cardType = scanner.next();

        Card card = DiscountCalculator.getCardType(cardType);
        if (card != null) {
            double finalAmount = card.calculateFinalAmount(amount);
            double discount = card.getDiscount();
            System.out.printf("Card Type: %s%n", cardType);
            System.out.printf("Original Amount: %.2f%n", amount);
            System.out.printf("Discount: %.2f%%%n", discount * 100);
            System.out.printf("Final Amount after discount: %.2f%n", finalAmount);
        }

        scanner.close();
    }
}
