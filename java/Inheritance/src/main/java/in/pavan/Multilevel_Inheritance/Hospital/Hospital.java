package in.pavan.Multilevel_Inheritance.Hospital;

public class Hospital {
    private String hospitalName;
    private String location;

    public Hospital(String hospitalName, String location){
        this.hospitalName=hospitalName;
        this.location=location;
    }

    public void  displayHospitalDetails(){
        System.out.println("Hospital  name is : "+this.hospitalName);
        System.out.println("Hospital location is : "+this.location);
    }



}
