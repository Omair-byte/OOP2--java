public class DepositAccounnt extends Account
{
    //Attributes
    private double interestRate;

    //Constructor
    public DepositAccounnt(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance, double interestRate)
    {
        super(accountName, sortCode, branchName, inCredit, acctBalance);
        this.interestRate = interestRate;
    }

    //Methods
    public void withdraw(double withdrawAmount)
    {
        System.out.println("This is a Deposit Account, Withdraw not permitted");
    }

    //Attributes
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}

