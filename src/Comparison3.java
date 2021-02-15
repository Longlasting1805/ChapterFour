import java.util.Scanner;

public class Comparison3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int largest;
        int smallest;
        int maximum;
        int mode;
        int Mean;


        System.out.println("enter first integer");
        largest = input.nextInt();

        System.out.println("enter second integer");
        smallest = input.nextInt();

        System.out.println("enter third integer");
        int thirdNumber = input.nextInt();

        System.out.println("enter forth integer");
        int forthNumber = input.nextInt();

        System.out.println("enter fifth integer");
        int fifthNumber = input.nextInt();



        if (largest > smallest){
            System.out.printf("largest is %d%n" , largest);
        }
        if (largest > thirdNumber){
            System.out.printf("smallest is %d%n" , largest , thirdNumber);
        }
        if (largest > forthNumber){
            System.out.printf("largest is %d%n" ,largest , forthNumber);
        }
        if (largest > fifthNumber) {
            System.out.printf("smallest is %d%n" , largest , fifthNumber);
        }


    }
}