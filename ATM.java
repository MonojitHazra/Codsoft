import java.util.*;
class Account {
    double balance;
    public Account(double inibalan)
    {
        this.balance=inibalan;
    }
    double getBalan()
    {
        return balance;
    }
    void deposit(double amount)
    {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        }
        else{
            System.out.println("Invalid amount for deposit.");
        }
    }
    void withdraw(double amount)
    {
        if(amount > 0 && amount <=balance)
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: "+balance);
        }
        else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
}
class ATM
{
    private Account account;
    private Scanner sc;

    ATM(Account account)
    {
        this.account=account;
        this.sc =new Scanner(System.in);
    }
    void show()
    {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    void run()
    {
        int ch;
        do{
            show();
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    checkbalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank You for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid Choice. Please select a valid option.");
            }
        }
        while (ch != 4);
    }
   private void checkbalance(){
        System.out.println("Your current balance is: "+account.getBalan());
    }
    void deposit()
    {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }
    void withdraw(){
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
class ATM_Interface
{
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your four digit PIN: ");
            int enterPin=sc.nextInt();

        Account User=new Account(10000.00);
        ATM atm=new ATM(User);
        atm.run();
    }
}