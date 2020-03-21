public class Employee {
    //Attributes
    private String firstName;
    private String secondName;
    private int staffNumber;
    private double annualSalary;
    private double monthlyPay;

    //Constructor
    public Employee(String firstName, String secondName, int staffNumber, double annualSalary)
    {
        this.firstName   = firstName;
        this.secondName  = secondName;
        this.staffNumber = staffNumber;
        this.annualSalary= annualSalary;

    }

    //getter&setter FirstName
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getSurName()
    {
        return secondName;
    }

    public void setSurName(String SurName)
    {
        this.secondName = secondName;
    }

    public int getStaffNumber()
    {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber)
    {
        this.staffNumber = staffNumber;
    }


    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    //getter&setter for monthlypay
    public double getMonthlyPay()
    {
        return monthlyPay;
    }

    public double calculatePay(double annualSalary)
    {
        monthlyPay = annualSalary /12;
        return monthlyPay;
    }

    @Override
    public String toString() {
        return "Employee " + firstName+" " + secondName + " has a staff number of "+staffNumber +
                ", his annual salary is " + annualSalary +
                ", and that is " + monthlyPay +" each month";
    }
}