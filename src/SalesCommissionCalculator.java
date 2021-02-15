import java.util.Scanner;

public class SalesCommissionCalculator {
    private double grossSalePerWeek;
    private final double BASE_PAY = 200;
    private final double percentage = 0.09;

    public double salesItemsSold(double itemSold) {

        double value = 0;

        if (itemSold == 1) {
            value = 233.9;
        } else if (itemSold == 2) {
            value = 129.75;

        } else if (itemSold == 3) {
            value = 99.95;

        } else if (itemSold == 4) {
            value = 350.89;
        } else {
            value = 0;
        }

        return value;
    }

    public void getTotalItemSold(double i){
        double value = salesItemsSold(i);
        grossSalePerWeek+= value;
    }


    public double salePersonsEarning(){
         double result = BASE_PAY + (percentage * grossSalePerWeek);
        return result;


    }

}