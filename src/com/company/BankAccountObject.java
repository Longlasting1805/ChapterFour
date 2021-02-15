package com.company;


import java.util.Scanner;

public class BankAccountObject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount kenny = new BankAccount("kenny" , 1200);

        kenny.setBankName("kenny");
        System.out.printf("this account holder is %s%n",kenny.getBankName());

            kenny.setBankPin(2456);
            System.out.printf("this pin is %d%n",kenny.getBankPin());


             kenny.setBalance(1200);
             System.out.printf("account balance is %s%n",kenny.getBalance());

             kenny.withdrawal(500);
             System.out.printf("withdrawal balance %s%n",kenny.getBalance());

             kenny.deposit( 400);
             System.out.printf("deposit balance is %s%n",kenny.getBalance());




    }
}