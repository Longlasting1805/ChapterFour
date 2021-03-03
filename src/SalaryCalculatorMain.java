import java.util.Scanner;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator= new SalaryCalculator(0,0);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter hour worked for employee1");
        salaryCalculator.setWorkHour(scanner.nextInt());
        System.out.println("Enter employee1 hourly pay");
        salaryCalculator.setHourlyPay(scanner.nextDouble());
        System.out.printf("Employee 1 worked for %d hours and the pay is %.2f",salaryCalculator.getWorkHour(),salaryCalculator.getGrossPay());
    }
}
