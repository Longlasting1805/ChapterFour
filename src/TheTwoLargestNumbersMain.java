import java.util.Scanner;

public class TheTwoLargestNumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheTwoLargestNumbers theTwoLargestNumbers = new TheTwoLargestNumbers();
//        System.out.println("enter the largestNumber");
//        theTwoLargestNumbers.setLargestNumber(scanner.nextInt());
//        System.out.println("enter the secondLargestNumber");
//        theTwoLargestNumbers.setSecondLargestNumber(scanner.nextInt());
        for (int counter=0; counter<10; counter++) {
            System.out.println("enter the number");
            theTwoLargestNumbers.setNumber(scanner.nextInt());
        }

        System.out.printf("LargestNumber is: %d%n SecondLargestNumber is %d",theTwoLargestNumbers.getLargestNumber(),theTwoLargestNumbers.getSecondLargestNumber());
    }
}
