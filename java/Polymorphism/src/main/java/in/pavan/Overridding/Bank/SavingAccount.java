package in.pavan.Overridding.Bank;

public class SavingAccount extends BankAccount{


    @Override
    public void calculateIntrest(){
        System.out.println("Calculating Intrest for Saving account ! ");

    }
}
