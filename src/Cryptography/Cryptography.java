package Cryptography;

public class Cryptography {

    // encrypting steps
    // Separating Steps

    static int  division,division1,division2,division3;

    public static
    int encryptNumber(int number){

        //separations

        int firstNumber = number / 10;
        division = number % 10;
        int secondNumber = firstNumber / 10;
        division1 = firstNumber  % 10;
        int thirdNumber = secondNumber / 10;
        division2 = secondNumber % 10;
        division3 = thirdNumber % 10;

        //adding 7;


        division += 7;
        division1 +=7;
        division2 +=7;
        division3 += 7;

        //getting remainder
        division  %= 10;
        division1 %= 10;
        division2 %= 10;
        division3 %= 10;



        //swap first with third || swap second with forth
//        System.out.printf("encrypted value %d%d%d%d",division2 , division3 , division, division1 );
//        System.out.printf("e %s%s%s%s","division2", division3, division , division1);
            String encrypt = String.format("%d%d%d%d",division2 , division3 , division, division1);
        System.out.println(encrypt);
        return Integer.parseInt(encrypt);
    }
}
