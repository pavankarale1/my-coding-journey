package in.pavan.Multilevel_Inheritance.q2;

public class BankCustomer extends Person{
    int cid;
    String mno;
    String email;

    public BankCustomer(String name, int age, String city, int cid, String mno, String email) {
        super(name, age, city);
        System.out.println("This is BankCustomer Conastructor ! ");
        this.cid = cid;
        this.mno = mno;
        this.email = email;
    }
    public void displayCustomerDetails(){
        System.out.println("Customer id is : "+cid);
        System.out.println("Mobail Number : "+mno);
        System.out.println("Email is : "+email);
    }
    private void customerSupport(){
        System.out.println("Customer Support available 24/7");
    }
}
