import java.util.Scanner;

public class ProductObject{
    public static void main(String[] args) {
        Product kenny = new Product();
        kenny.setFirstInteger(134);
        System.out.println(kenny.getFirstInteger());

        kenny.setSecondInteger(234);
        System.out.println(kenny.getSecondInteger());

        kenny.setThirdInteger(233);
        System.out.println(kenny.getThirdInteger());

        System.out.println(kenny.getProduct());
    }
}
