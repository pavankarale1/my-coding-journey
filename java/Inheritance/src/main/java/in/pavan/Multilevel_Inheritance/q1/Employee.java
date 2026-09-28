package in.pavan.Multilevel_Inheritance.q1;

public class Employee extends Person {
    int id;
    float salary;
    public Employee(String name,int age,int id,float salary){
        super(name,age);
        System.out.println("Employee constructor called ! ");
        this.id=id;
        this.salary=salary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee id : "+id);
        System.out.println("Salary : "+salary);
    }
    public void work(){
        System.out.println("Employee is working ! ");
    }
}
