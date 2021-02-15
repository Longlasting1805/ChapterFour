public class CreditLimitCalculator {

    private int accountNumber;
    private int beginningBalance;
    private int itemCharged;
    private int newBalance;
    private int creditApplied;
    private int creditLimit;


    public CreditLimitCalculator(int accountNumber, int beginningBalance, int itemCharged, int newBalance, int creditApplied, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.itemCharged = itemCharged;
        this.creditApplied = creditApplied;
        this.creditLimit = creditLimit;
        this.newBalance =  beginningBalance + itemCharged - creditLimit;

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBeginningBalance(int beginningBalance){
        this.beginningBalance = beginningBalance;
    }
    public int getBeginningBalance(){
        return  beginningBalance;
    }

    public void setCreditApplied(int creditApplied){
        this.creditApplied = creditApplied;
    }
    public int getCreditApplied(){
        return creditApplied;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

    public void setItemCharged(int itemCharged){
        this.itemCharged = itemCharged;
    }

    public int getItemCharged(){
        return itemCharged;
    }


    public void calculateNewBalance(){
        newBalance = beginningBalance + itemCharged - creditLimit;
        if (creditLimit < newBalance){
            System.out.println("credit limit exceeded");
        }


    }
}













