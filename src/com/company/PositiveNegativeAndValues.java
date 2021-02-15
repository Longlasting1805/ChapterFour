package com.company;

import java.util.Scanner;

public class PositiveNegativeAndValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int counterOfZero =0;
        int counterOfPositive = 0;
        int counterOfNegative = 0;

        System.out.println("enter first integer: ");
        int First = input.nextInt();

        if(First == 0){
            counterOfZero += 1;
        }
        if(First > 0){
            counterOfPositive += 1;
        }
        if(First < 0){
            counterOfNegative += 1;
        }

        System.out.println("enter second integer: ");
        int second = input.nextInt();
        if (second == 0){
            counterOfZero += 1;
        }
        if (second > 0){
            counterOfPositive += 1;
        }
        if (second < 0){
            counterOfNegative += 1;
        }


        System.out.println("enter third integer: ");
        int third = input.nextInt();

        if (third == 0){
            counterOfZero += 1;
        }
        if(third > 0){
            counterOfPositive += 1;
        }
        if (third < 0){
            counterOfNegative += 1;
        }

        System.out.println("enter forth integer: ");
        int forth = input.nextInt();

        if (forth == 0){
            counterOfZero += 1;
        }
        if (forth > 0){
            counterOfPositive += 1;
        }
        if (forth < 0){
            counterOfNegative += 1;
        }

        System.out.println("enter fifth integer: ");
        int fifth = input.nextInt();

        if (fifth == 0){
            counterOfZero += 1;
        }
        if (fifth > 0){
            counterOfPositive += 1;
        }
        if (fifth < 0){
            counterOfNegative += 1;
        }

        System.out.printf("the number of positive value is %d%n" , counterOfPositive);
        System.out.printf("the number of negative value is %d%n" , counterOfNegative);
        System.out.printf("the number of zero value is %d%n" , counterOfZero);


    }
}
