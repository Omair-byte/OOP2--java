public class CurrentAccount extends Account
{
    //Attributes
    private double  penaltyAmount;

    //Constructor


    public CurrentAccount(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance, double penaltyAmount) {
        super(accountName, sortCode, branchName, inCredit, acctBalance);
        this.penaltyAmount = penaltyAmount;
    }

    //Methods
    public void withdraw(double withdrawAmount)
    {
        double balance = getAcctBalance();
        if (balance - withdrawAmount >0)
        { setAcctBalance(balance - withdrawAmount); }
        else
        { System.out.println("Insufficient Funds"); }

    }

    public String checkCredit()
    {
        if(getAcctBalance() > 0)
        { return "Not in Credit"; }
        else
        { return "In Credit"; }
    }

    public String checkCredit(String warningMeassage)
    {
        if(getAcctBalance() > 0 && getAcctBalance() < 100)
        {return "Warning Low Balance";}
        else
        { return "";}
    }

    //getters and setter
    public double getPenaltyAmount() { return penaltyAmount; }
    public void setPenaltyAmount(double penaltyAmount) { this.penaltyAmount = penaltyAmount; }
}
