package ChapterFiveExamples;

public class ContinueObject {
    public static void main(String[] args) {


        for (int count = 1; count <= 10; count++){
            if (count == 5)
                continue;//skip remaining in loop if count is 5
            System.out.printf("%d%n",count);
        }
        System.out.printf("%nUsed continue to keep printing 5");
    }
}
