import java.util.Scanner;

public class ValidationUserInputMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number to proceed");
        int userInput = scanner.nextInt();


        if (userInput != 1 && userInput != 2){
            System.out.println("Enter 1 or 2 to proceed ");
        }
        else{
            System.out.println("number validated");
        }





        }
}

