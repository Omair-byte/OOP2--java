public class Account
{
    //Atrributes
    private String accountName;
    private String sortCode;
    private String branchName;
    private int accountNumber;
    private boolean inCredit;
    private double acctBalance;
    private static int currentNumber = 0;

    //Constructor
    public Account(String accountName, String sortCode, String branchName,boolean inCredit,double acctBalance)
    {
        accountNumber = currentNumber;
        currentNumber++;
        this.accountName  = accountName;
        this.sortCode     = sortCode;
        this.branchName   = branchName;
        this.inCredit     = inCredit;
        this.acctBalance  = acctBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", accountNumber=" + accountNumber +
                ", inCredit=" + inCredit +
                ", acctBalance=" + acctBalance +
                '}';
    }

    //Methods
    public void deposit(double depositAmount)
    {
            acctBalance += depositAmount;
    }

    public void withdraw(double withdrawAmount)
    {
        acctBalance -= withdrawAmount;
        if (acctBalance < 0)
        {
            inCredit = false;
        }
    }

    public void getDetails()
    {
        System.out.println("Account type: "+accountName+", Account Number: "+accountNumber+", Balance: "+acctBalance);
    }

    public void valuableAccount()
    {
        System.out.println("Account balance: "+acctBalance);
    }

    //getters and setters for attributes

    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }

    public String getSortCode() { return sortCode; }
    public void setSortCode(String sortCode) { this.sortCode = sortCode; }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public boolean isInCredit() { return inCredit; }
    public void setInCredit(boolean inCredit) { this.inCredit = inCredit; }

    public double getAcctBalance() { return acctBalance; }
    public void setAcctBalance(double acctBalance) { this.acctBalance = acctBalance; }

}
