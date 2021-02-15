import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum;

        System.out.print("enter first integer: ");
        x = input.nextInt();

        System.out.print("enter second integer: ");
        y = input.nextInt();

        sum = x + y;

        System.out.printf("sum is %d%n", sum);
    }
}
