/* Write a Java program that creates a class accounts with following details:
Instance variables: ac_no., name, ac_name, balance
Methods: withdrawal (), deposit (), display ().use constructors to initialize members */

class eAccounts{
    // instance variables
    int ac_no;
    String name, ac_name;
    double balance;
    // constructor
    eAccounts(int ac_no, String name, String ac_name, double balance){
        this.ac_no = ac_no;
        this.name = name;
        this.ac_name = ac_name;
        this.balance = balance;
    }
    // this method withdraws amount from balance
    void withdrawal(double amount){
        if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }
    // this method deposits amount to balance
    void deposit(double amount){
        balance += amount;
    }
    // this method displays account details
    void display(){
        System.out.println("Account number: " + ac_no);
        System.out.println("Name: " + name);
        System.out.println("Account name: " + ac_name);
        System.out.println("Balance: " + balance+"\n");
    }
    public static void main(String[] args) {
        // create object of eAccounts class
        eAccounts e = new eAccounts(123456, "John", "Savings", 10000);
        // before withdrawal
        System.out.println("Before withdrawal:");
        e.display();
        // withdraw 5000
        e.withdrawal(5000);
        // after withdrawal
        System.out.println("After withdrawal of 5000:");
        e.display();
        // deposit 1000
        e.deposit(1000);
        // after deposit
        System.out.println("After deposit of 1000:");
        e.display();
    }
}
