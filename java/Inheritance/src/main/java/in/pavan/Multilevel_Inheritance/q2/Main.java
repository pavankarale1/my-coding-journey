package in.pavan.Multilevel_Inheritance.q2;

public class Main {
    static void main(String[] args) {

        SavingAccount account1 = new SavingAccount(
                "Pavan Karale", 22, "Pune", 101,
                "9876543210", "pavan@gmail.com",
                123456789, 50000.00, "Savings", 6.5f, 10000.00
        );
        account1.displaySavingDetails();

    }
}
