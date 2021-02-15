package com.company;
import java.util.Scanner;

public class EmployeeObject {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    employee kenny = new employee("laredo", "billy", 3.11);
    employee billy = new employee("ken", "aka", 21.5);

    kenny.setF_name("laredo");
            System.out.printf("Firstname: %s%n", kenny.getF_name());

        kenny.setF_name("billy");
            System.out.printf("lastname: %s%n", kenny.getL_name());

        kenny.setMonthly_salary(0.11);
            System.out.printf("monthly salary %s%n", kenny.getMonthly_salary());
            kenny.increase_salary();
        System.out.printf("monthly salary %s%n", kenny.getMonthly_salary());






    }

}
