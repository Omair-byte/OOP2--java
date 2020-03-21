public class Control
{
    public static void main(String[] args)
    {
        Employee[] myEmployees= new Employee[6];
        myEmployees[0] = new Employee("Omair","Duadu",12345, 89780.97);
        myEmployees[1] = new SalesEmployee("Sultan","Alghamdi",3,45,17);
        myEmployees[2] = new SalesEmployee("Matthew","Ennis",3,36000,2000);
        myEmployees[3] = new Employee("Enoch","Oppong",6,60000);
        myEmployees[4] = new HourlyEmployee("Matthew","Ennis",5,20,10);
        myEmployees[5] = new SalesEmployee("Matthew","Ennis",6,24000,10000);

        for (Employee employee : myEmployees)
        {
            System.out.println(employee);
            System.out.println("Pay is"+employee.calculatePay(0));
        }
    }
}
