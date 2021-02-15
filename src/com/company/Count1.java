package com.company;
import java.util.Scanner;

public class Count1 {

    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);

            int x;
            int y;
            int z;
            int sum;

            System.out.print ("enter first integer");
            x = input.nextInt();

            System.out.print ("enter second integer");
            y = input.nextInt();

            System.out.print ("enter third integer");
            z = input.nextInt();

            sum = x + y + z;
            System.out.printf("sum is %d", sum);


    }
}


