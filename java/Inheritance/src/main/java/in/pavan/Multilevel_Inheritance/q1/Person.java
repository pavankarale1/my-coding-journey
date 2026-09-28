package in.pavan.Multilevel_Inheritance.q1;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person constructor called");
    }

    public void displayPersonDetail(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

}
