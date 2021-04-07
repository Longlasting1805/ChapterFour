package ChapterFiveExamples;

public class AutoPolicy {
    public static void main(String[] args) {

    }

    private int accountNumber; //policy accountNumber
    private String makeAndModel; //car that policy applies to
    private String state; //two-letter state application

    //    constructor
    public AutoPolicy(int accountNumber,String makeAndModel,String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    predicate method returns whether the state has no fault insurance
    public boolean isNoFaultState(){
        boolean noFaultState;
        //    predicate method returns whether the state has no-fault insurance
        switch (getState()){ //get autoPolicy object's state abbreviation
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
