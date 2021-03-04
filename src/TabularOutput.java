public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%s  %s  %s  %s  %n", "N", "10*N", "100*N", "1000*N");

        for (int counter=1; counter < 6; ++counter){
            System.out.printf("%d  %2d  %5d  %6d  %n",counter, counter*10, counter*100, counter*1000);
        }





    }
}
