public class SalesEmployee extends Employee
{
    //attribute
    private double commission;

    //getter&setter
    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    //Constructor

    public SalesEmployee(String firstName, String secondName, int staffNumber, double annualSalary, double commission)
    {
        super(firstName, secondName, staffNumber, annualSalary);
        this.commission = commission;
    }


    public double calculatePay()
    {
        return super.calculatePay(0) +commission;
    }
}
