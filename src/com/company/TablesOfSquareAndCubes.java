package com.company;

public class TablesOfSquareAndCubes {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%n" , "number" , "square" , "cube");

        for(int counter=0; counter<=10;counter++ )

        System.out.printf("%d%10d%10d%n", counter, counter*counter, counter*counter*counter );
    }
}
