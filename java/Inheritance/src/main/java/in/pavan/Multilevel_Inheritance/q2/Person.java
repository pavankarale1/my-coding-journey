package in.pavan.Multilevel_Inheritance.q2;

public class Person {
    String name;
    int age;
    String city;

    public Person(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public void desplayPersonDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("City is : "+city);
    }
}
