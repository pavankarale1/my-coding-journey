package in.pavan.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(111,500000);
        bankAccount1.dispalyAccountDeatails();

        //Acess Privete variable through the getter and setter methord's
        bankAccount1.setAccount_no(101);
        bankAccount1.setBalance(60000);
    }
}
