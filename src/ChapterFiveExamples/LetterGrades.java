package ChapterFiveExamples;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class LetterGrades {
    public static void main(String[] args) {

        int total = 0; //sum
        int gradeCount = 0; //numbers of grades entered
        int aCount = 0; //count of A grades
        int bCount = 0; //count of B grades
        int cCount = 0; //count of C grades
        int dCount = 0; //count of D grades
        int fCount = 0; //count of F grades

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n","enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                 "On Windows type <Ctrl> z then press Enter");

//        loop until user enter -1 to terminate input
        while (input.hasNext()){
            int grade = input.nextInt();//read grade
            total += grade;//add grade to total
            gradeCount++;//increment number of grades

//            increment appropriate letter grade counter TODO
            switch (grade / 10){
                case 9://grade was between 90
                case 10://and 100,inclusive
                    ++aCount;
                    break;//exit switch
                case 8://grade was between 80 and 89
                    ++bCount;
                    break;//exit switch
                case 7://grade was between 70 and 79
                    ++cCount;
                    break;//exit switch
                case 6://grade was between 60 and 69
                    ++dCount;
                    break;//exit switch
                default://grade was between 50 and 59
                    ++fCount;
                    break;//exit switch
            }//end switch

        }//end while
        System.out.printf("%n Grade Report: %n");

//        if user enter at least one grade
        if (gradeCount != 0){
//            calculate average of all grade entered
            double average = (double) total / gradeCount;
//            output summary of all results
            System.out.printf("total of the %d grades is entered %d%n", total, gradeCount);
            System.out.printf("class average is %.2f%n",average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","number of each students who received each grade",
                    "A:",aCount,
                    "B:",bCount,
                    "C:",cCount,
                    "D",dCount,
                    "F",fCount);

        }else
            System.out.println("no grade were enter");

    }
}
