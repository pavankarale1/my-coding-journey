package in.pavan.Bank;

public class BankAccount {
    private int account_no;
    private double balance;

    public BankAccount(int account_no, double balance) {
        this.account_no = account_no;
        this.balance = balance;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
        System.out.println("After changing Account number \n Account Details are : ");
        this.dispalyAccountDeatails();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
        System.out.println("After changing Balance \n Account Details are : ");
        this.dispalyAccountDeatails();
    }
    public void dispalyAccountDeatails(){
        System.out.println("Accunt number is : "+this.account_no);
        System.out.println("Balance of your acccount is : "+this.balance);
    }
}
