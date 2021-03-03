import java.util.Scanner;

public class FindTheLargestNumberMain {
    public static void main(String[] args) {
        FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber(0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the contestWinner");
        findTheLargestNumber.setContestWinner(scanner.nextInt());

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number");
            numbers[i] = scanner.nextInt();
        }

        int LargestNumber = FindTheLargestNumber.getLargestNumber(numbers);
        System.out.printf("the contestWinner is %d%n the largest number is %d%n",findTheLargestNumber.getContestWinner(), LargestNumber);
    }
}
