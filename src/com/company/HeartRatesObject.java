package com.company;
import java.util.Scanner;

public class HeartRatesObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRates pill = new HeartRates("titus", "billy", 28, 02, 1999 );

        pill.setFirstname("titus");
        System.out.printf("firstname: %s%n", pill.getFirstname());

        pill.setLastname("bill");
        System.out.printf("lastname: %s%n", pill.getLastname());

        System.out.println(pill.returnTargetHeartRate());









    }
}
