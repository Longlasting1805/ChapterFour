import javax.swing.*;
import java.util.Scanner;

public class FindTheLargestNumber {

    private int largestNumber;
    private int contestWinner;

    public FindTheLargestNumber(int largestNumber, int contestWinner) {
        this.largestNumber = largestNumber;
        this.contestWinner = contestWinner;

    }

    public void setContestWinner(int contestWinner) {
        this.contestWinner = contestWinner;
    }

    public int getContestWinner() {
        return contestWinner;
    }

    public
    void setLargestNumber(int number) {
        this.largestNumber = number;

    }

    public
    static int getLargestNumber(int [] numbers) {
        int counter = 0;
        int LargestNumber = 0;
        Scanner largest = new Scanner(System.in);
        while (counter < 10 ) {

            if (numbers[counter] > LargestNumber) {
                LargestNumber = numbers[counter];
            }
            counter++;
        }
        return LargestNumber;

    }

}