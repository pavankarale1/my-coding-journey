package in.pavan.Overridding.Bank;

public class CurrentAccount extends  BankAccount{
    @Override
    public void calculateIntrest(){
        System.out.println("Calculatig current account Intrest ! ");
    }
}
