package in.pavan.Multilevel_Inheritance.q1;

public class Main {
    static void main(String[] args) {
        Devleloper devleloper= new Devleloper("Pavan",22,1,50000,"Java",2);

        devleloper.displayDeveloperDetails();
        devleloper.displayPersonDetail();
        devleloper.displayEmployeeDetails();
        devleloper.work();
        devleloper.writeCode();

    }
}
