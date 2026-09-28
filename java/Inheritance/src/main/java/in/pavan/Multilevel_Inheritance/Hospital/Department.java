package in.pavan.Multilevel_Inheritance.Hospital;

public class Department extends Hospital{

    private String departmentName;
    private  int numberOfBeds;


    public Department(String hospitalname, String location,String departmentName, int numberOfBeds){
        super(hospitalname,location);
        this.departmentName=departmentName;
        this.numberOfBeds=numberOfBeds;
    }

    public void displayDepartmentDetails(){
        System.out.println("Department name is : "+departmentName);
        System.out.println("Number of beds : "+numberOfBeds);
    }


}
