package Cryptography;

import jdk.dynalink.beans.StaticClass;

public class DecryptValues {
    Cryptography cryptography = new Cryptography();


    public static void decryptNumber(int number){

        int firstDigit = number / 10;
        int division = number % 10;
        int secondDigit = firstDigit / 10;
        int division1 = firstDigit  % 10;
        int thirdDigit = secondDigit / 10;
        int division2 = secondDigit % 10;
        int division3 = thirdDigit % 10;

        if (division >= 7){
            division -= 7;
        }else
            division += 10 - 7;

        if (division1 >= 7){
            division1 -= 7;
        }else
            division1 += 10 - 7;

        if (division2 >= 7){
            division2 -= 7;
        }else
            division2 += 10 - 7;

        if (division3 >= 7){
            division3 -= 7;
        }else
            division3 += 10 - 7;



        String decrypt = String.format("%d%d%d%d",division2 , division3 , division, division1);
        System.out.println(decrypt);
    }

//    public static int decryptNumber1(int number) {
//
//    }
}
