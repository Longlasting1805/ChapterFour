package ChapterFiveExamples;

public class BreakFast {
    public static void main(String[] args) {
        int fast = 1;//control variable also used after loop terminates
                for(fast = 1; fast <= 10; fast++) {//loop 10 times

                    if (fast == 5)
                    break;//terminates loop if count is 5
                    System.out.printf("%d ",fast);
                }
        System.out.printf("%n Broke Out Of Loop Of Count = %d%n", fast);


    }
}
