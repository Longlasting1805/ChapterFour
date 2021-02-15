import java.util.Scanner;

public class Multiple2 {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        int multiple;
        int remainder;

        System.out.print("enter first integer: ");
        int firstNumber = multi.nextInt();

        System.out.print("enter second integer: ");
        int secondNumber = multi.nextInt();


        multiple = firstNumber * secondNumber;
        remainder = multiple % secondNumber;

        if (firstNumber > secondNumber){
            System.out.printf("multiple is %d%n" , multiple , remainder );
        }
        else{
            System.out.printf("remainder is %d%n" , remainder , multiple);
        }

    }
}