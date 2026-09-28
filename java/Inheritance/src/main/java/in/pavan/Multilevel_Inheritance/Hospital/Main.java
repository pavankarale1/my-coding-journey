package in.pavan.Multilevel_Inheritance.Hospital;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor(
                "Ruby Hospital",
                "Pune",
                "Cardiology",
                50,
                "Pavan",
                "Cardiologist",
                80000.00
        );

        doctor.displayHospitalDetails();
        doctor.displayDepartmentDetails();
        doctor.displayDoctorDetails();

        double annualSalary = doctor.calculateAnnualSalary();
        System.out.println("Annual Salary is : " + annualSalary);
    }


}
