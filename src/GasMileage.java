import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMileDriven=0;
        int totalGallonUsed=0;
        int mileDriven = 0;
        int gallons =0;

        System.out.println("enter mileDriven: ");
        mileDriven = input.nextInt();

        System.out.println("enter gallon: ");
        gallons = input.nextInt();

        while(mileDriven != -1 && gallons != -1){
            totalMileDriven+= mileDriven ;
            totalGallonUsed+= gallons;

            System.out.println("enter mileDriven: ");
            mileDriven = input.nextInt();

            System.out.println("enter gallon: ");
            gallons = input.nextInt();

        }
            double gasUsed = (double) totalMileDriven / totalGallonUsed;
            System.out.println("the gas used is: "+ gasUsed);
            System.out.printf("the miles driven is %d%n the gallon used is %d%n", totalMileDriven,totalGallonUsed);

    }
}