import java.util.Scanner;

public class Exchange {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int odd;

            System.out.println("enter an integer");
            int firstNumber = input.nextInt();

            odd = 2 / firstNumber;

            if (2 < firstNumber){
                System.out.printf("number is odd %d%n :" , odd , firstNumber);
            }
            else{
                System.out.printf("number is even %d%n" , firstNumber , odd);
            }

        }
    }

