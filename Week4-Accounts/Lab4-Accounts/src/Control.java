public class Control
{
    public static void main(String[] args)
    {
        Account a1 = new Account("Main","99-99-99","Dundrum",true,5000);
        Account a2 = new DepositAccounnt("Deposit","88-88-88","Kexin St.",true,200,10);
        Account a3 = new CurrentAccount("Current","77-77-77","Aungier",true,100,25);



            a1.getDetails();
            a1.deposit(10);
            a1.withdraw(150);
            a1.valuableAccount();
            System.out.println();


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
