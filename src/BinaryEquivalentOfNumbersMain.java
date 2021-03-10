import java.util.Scanner;

public class BinaryEquivalentOfNumbersMain {
    public static void main(String[] args) {
        BinaryEquivalentOfNumbers binaryEquivalentOfNumbers= new BinaryEquivalentOfNumbers();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the binary you want to convert");
        int number=input.nextInt();
        binaryEquivalentOfNumbers.setNumber(number);
        binaryEquivalentOfNumbers.convertToDecimal();
        System.out.printf("The decimal equivalent is %d",binaryEquivalentOfNumbers.getBinaryEquivalent());
    }
}
