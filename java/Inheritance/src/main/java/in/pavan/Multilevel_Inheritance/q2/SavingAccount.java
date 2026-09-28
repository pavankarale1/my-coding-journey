package in.pavan.Multilevel_Inheritance.q2;

public class SavingAccount extends BankAccount{
    float intrestRate;
    double minimumBalance;

    public SavingAccount(String name, int age, String city, int cid, String mno, String email, int ano, double balance, String atype, float intrestRate, double minimumBalance) {
        super(name, age, city, cid, mno, email, ano, balance, atype);
        this.intrestRate = intrestRate;
        this.minimumBalance = minimumBalance;
    }
    public void displaySavingDetails(){
        System.out.println("Intrest rate : "+intrestRate);
        System.out.println("minumun balance : "+minimumBalance);
    }
}
