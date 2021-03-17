package Cryptography;

import Cryptography.Cryptography;

import java.util.Scanner;

public class CryptographyMain {
    public static void main(String[] args) {
        Cryptography cryptography = new Cryptography();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter encryptNumber");
        int encrypt = scanner.nextInt();
        int encrypted = Cryptography.encryptNumber(encrypt);
        DecryptValues.decryptNumber(encrypted);
//        System.out.println("enter decryptNumber");
//        int decrypt = scanner.nextInt();
//        Cryptography.DecryptNumber(decrypt);
    }
}
