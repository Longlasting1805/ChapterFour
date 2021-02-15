public class Product {
    private int firstInteger;
    private int secondInteger;
    private int thirdInteger;

    public void setFirstInteger(int firstInteger) {
        this.firstInteger = firstInteger;
    }
    public int getFirstInteger(){
        return firstInteger;
    }

    public void setSecondInteger(int secondInteger){
        this.secondInteger = secondInteger;
    }
    public int getSecondInteger(){
        return secondInteger;
    }
    public void setThirdInteger(int thirdInteger){
        this.thirdInteger = thirdInteger;
    }
    public int getThirdInteger(){
        return thirdInteger;
    }
    public int getProduct(){
        return firstInteger * secondInteger * thirdInteger;
    }
}
