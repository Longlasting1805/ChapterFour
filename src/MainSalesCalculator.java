import java.util.Scanner;

public class MainSalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();

        System.out.println("Enter Item Sold, -1 to end");
        int userInput = scanner.nextInt();

        while (userInput != -1) {
            salesCommissionCalculator.getTotalItemSold(userInput);
            System.out.println("Enter Item Sold, -1 to end");
            userInput = scanner.nextInt();
        }

        System.out.println(salesCommissionCalculator.salePersonsEarning());

    }
}