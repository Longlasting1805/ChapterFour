import java.util.Scanner;

public class Comparison2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int average;
        int product;
        int value;
        int sum;

        System.out.println("enter first integer");
        int firstNumber= input.nextInt();

        System.out.println("enter second integer");
        int secondNumber = input.nextInt();

        System.out.println("enter third number");
        int thirdNumber = input.nextInt();


        product = firstNumber * secondNumber * thirdNumber;
        sum = firstNumber + secondNumber + thirdNumber;
        average = sum/3;

        System.out.printf("this product is %d%n:" , product);
        System.out.printf("this average is %d%n:" , average);
        System.out.printf("this sum is %d%n:" , sum);
    }
}