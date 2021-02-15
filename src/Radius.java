import java.util.Scanner;

public class Radius{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius :");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        System.out.printf("diameter %.2f%n" , diameter);

        double circumference = 2 * Math.PI * radius;
        System.out.printf("circumference %.2f%n" , circumference);

        double area = Math.PI * radius * radius;
        System.out.printf("area %.2f" , area);



    }






}
