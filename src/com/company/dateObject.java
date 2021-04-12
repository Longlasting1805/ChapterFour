package com.company;
import java.util.Scanner;

public class dateObject {
    public static
    void main(String[] args) {
        date kenny = new date(02,28,1997);

        kenny.setMonth(02);
        System.out.printf("month: %d%n",kenny.getMonth());

        kenny.setDay(28);
        System.out.printf("day: %d%n",kenny.getDay());

        kenny.setYear(1997);
        System.out.printf("year: %d%n",kenny.getYear());

        kenny.display_date();

    }
}
