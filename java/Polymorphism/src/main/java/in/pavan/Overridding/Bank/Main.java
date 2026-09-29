package in.pavan.Overridding.Bank;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount= new SavingAccount();
        CurrentAccount currentAccount= new CurrentAccount();

        savingAccount.calculateIntrest();
        currentAccount.calculateIntrest();
    }
}
