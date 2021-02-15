package com.company;
import java.util.Scanner;

public class invoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        invoice kenny = new invoice("ken" , "disc", 10 , 3.220);

        kenny.setInvoice_name("ken");
        System.out.printf("store name: %s%n",kenny.getInvoice_name());

        kenny.setDescription("disc");
        System.out.printf("item sold: %s%n",kenny.getRecurring());

        kenny.setItem_quantity(5);
        System.out.printf("item quantity is %d%n", kenny.getItem_quantity());

        kenny.setInvoice_amount(3.221);
        System.out.printf("invoice amount: %s%n", kenny.getInvoice_amount());


    }
}
