import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the integer: ");
        int digit = input.nextInt();

        int a1 = digit / 100000;
        int a2 = digit / 10000 % 10;
        int a3 = digit / 1000 % 10;
        int a4 = digit / 100 % 10;
        int a5 = digit / 10 % 10;
        int a6 = digit / 1 % 10;

        System.out.printf("%d   %d   %d   %d   %d   %d" , a1   , a2   , a3   , a4   , a5    , a6);


    }

}
