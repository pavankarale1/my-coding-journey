package in.pavan.Multilevel_Inheritance.Hospital;

public class Doctor extends Department{

    private String doctorName;
    private String specialization;
    private double salary;


    public Doctor(String hospitalname,String location, String departmentName ,int numberOfBeds,String doctorName,String specialization,double salary){
        super(hospitalname,location,departmentName,numberOfBeds);
        this.doctorName=doctorName;
        this.specialization=specialization;
        this.salary=salary;
    }

    public void displayDoctorDetails(){
        System.out.println("Doctor name is : "+doctorName);
        System.out.println("Doctor Specialization is : "+specialization);
        System.out.println("Doctor`s salary is : "+salary);
    }
    public double calculateAnnualSalary(){
        return salary*12;
    }

}
