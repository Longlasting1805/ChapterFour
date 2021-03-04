public class TheTwoLargestNumbers {

    private int largestNumber;
    private int secondLargestNumber;
    int count=0;


    public int getLargestNumber() {
        return largestNumber;
    }



    public int getSecondLargestNumber() {
        return secondLargestNumber;
    }

    public void setNumber(int number) {
    if(count==0) {
        largestNumber = number;
        secondLargestNumber = number;
        count++;
    }
  if(largestNumber<number){
      secondLargestNumber=largestNumber;
      largestNumber=number;

  }
  if(largestNumber>number&&secondLargestNumber<number){
      secondLargestNumber=number;
  }
    }
}
