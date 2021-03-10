public class BinaryEquivalentOfNumbers {
private int number;
private int binaryNumber;

    public void setNumber(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void convertToBinary() {
        int numberToConvert=number;
        binaryNumber=conversion(numberToConvert);
    }

    private int conversion(int numberToConvert) {
        int binary;
        int division=numberToConvert/2;
        int remainder1=numberToConvert%2;
        int remainder2=division%2;
        division=division/2;
        int remainder3=division%2;
        division=division/2;
        int remainder4 =division%2;

        String answer=String.valueOf(remainder4)
                +String.valueOf(remainder3)+
                String.valueOf(remainder2)+
                String.valueOf(remainder1);
        binary=Integer.parseInt(answer);
        return binary;
    }

    public int getBinaryEquivalent() {
        return binaryNumber;
    }

    public void convertToDecimal() {
        int numberToConvert=number;
        int firstNumber=numberToConvert/1000;
        int firstModulus=numberToConvert%1000;
        int secondNumber = firstModulus/100;
        int secondModulus = firstModulus%100;
        int thirdNumber=secondModulus/10;
        int thirdModulus=secondModulus%10;
        int fourthNumber= thirdModulus;
        int wholeNumber=(firstNumber*8)+
                (secondNumber*4)+(thirdNumber*2)
                +(fourthNumber);
        binaryNumber=wholeNumber;
    }
}
