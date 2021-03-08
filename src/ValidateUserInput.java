public class ValidateUserInput {
    int numberOne;
    int numberTwo;
    int count;

    public ValidateUserInput(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }


    public void setFirstNumber(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getFirstNumber() {
        return numberOne;
    }

    public void setSecondNumber(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getSecondNumber() {
        return numberTwo;
    }

}
