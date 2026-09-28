package in.pavan.Multilevel_Inheritance.q2;

public class BankAccount extends BankCustomer{
    int ano;
    double balance;
    String atype;

    public BankAccount(String name, int age, String city, int cid, String mno, String email, int ano, double balance, String atype) {
        super(name, age, city, cid, mno, email);
        this.ano = ano;
        this.balance = balance;
        this.atype = atype;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number : "+ano);
        System.out.println("Account type : "+atype);
        System.out.println("Balance is : "+balance);
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
        System.out.println("Currnt balance is : "+balance);
    }
    public void withdraw(double amount){
        this.balance=this.balance-amount;
        System.out.println("Currnt balance is : "+balance);
    }
    public void checkBlance(){
        System.out.println("Current Balance is : "+balance);
    }
}
