import java.util.Scanner;

public class CreditLimitCalculatorObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(2234, 100, 12, 200, 5, 500);
        creditLimitCalculator.setAccountNumber(2234);
        System.out.printf("the account number is %d%n", creditLimitCalculator.getAccountNumber());
        creditLimitCalculator.setBeginningBalance(100);
        System.out.printf("Beginning balance is %d%n", creditLimitCalculator.getBeginningBalance());

        creditLimitCalculator.setItemCharged(1200);
        System.out.printf("item charged %d%n", creditLimitCalculator.getItemCharged());

        creditLimitCalculator.setCreditApplied(5);
        System.out.printf("credit applied %d%n", creditLimitCalculator.getCreditApplied());

        creditLimitCalculator.calculateNewBalance();

    }
}
