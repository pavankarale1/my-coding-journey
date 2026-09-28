package in.pavan.Multilevel_Inheritance.q1;

public class Devleloper extends Employee {
    String planguage;
    int experiance;
    public Devleloper(String name,int age,int id,float salary,String planguage,int experiance){
        super(name,age,id,salary);
        System.out.println("Devloper constructor called ! ");
        this.planguage=planguage;
        this.experiance=experiance;
    }
    public void displayDeveloperDetails(){
        System.out.println("Programing language is : "+planguage);
        System.out.println("Experiance : "+experiance);

    }
    public void writeCode(){
        System.out.println("Devloper is writing code ! ");
    }
}
