public class HourlyEmployee extends Employee
{
    private double hourlyrate;
    private double hoursworked;

    //Constructor
    public HourlyEmployee(String firstName, String secondName, int staffNumber, double hourlyrate, double hoursworked) {
        super(firstName, secondName, staffNumber, 0);
        this.hoursworked = hoursworked;
    }

    //Methods
    public double calculatepay()
    {
        return hourlyrate * hoursworked;
    }

    public String toString()
    {
        return super.toString()+"but makes" + hourlyrate +" euros per hour at "+hoursworked+"hours per week";
    }

    public double getHourlyrate()
    {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate)
    {
        this.hourlyrate = hourlyrate;
    }

    public double getHoursworked()
    {
        return hoursworked;
    }

    public void setHoursworked(double hoursworked)
    {
        this.hoursworked = hoursworked;
    }
}
