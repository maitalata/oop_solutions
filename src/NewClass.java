public class NewClass{
    protected String accountId;
    protected double accountBalance;
    protected double interestRate;
    protected String accountName;

    public NewClass(){
        this.accountName = "New Account";
        this.accountId = "000";
        this.interestRate = 0.0;
        this.accountBalance = 0.0;
    }

    public NewClass(String accountId, String accountName){
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public NewClass(String accountName, String accountId, double accountBalance, double interestRate){
        this(accountId, accountName);
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
    }

    public void depositMoney(double amount){
        this.accountBalance += amount;
    }

    public void withdrawMoney(double amount){
        this.accountBalance -= amount;
    }

    public void computeInterest(){
        double interest = (this.accountBalance * this.interestRate)/100;
        this.accountBalance += interest;
    }

    public String printDetails(){
        return "Account Name: ("+this.accountName+")\nAccount Id: ("+this.accountId+"}\nAccount Balance: "+this.accountBalance+")";
    }

}