public class Nurse extends Staff {

    public Nurse(String name, int age){
        super(name,age,"Nurse");
    }


    public void performDuties(){
        System.out.println("Checking patient vitals and administering injections.");
    }


    public void checkVitals(Patient patient){
        System.out.println("Nurse " + getName() + " is checking vitals of patient: " + patient.getName());
        System.out.println("Patient condition: " + patient.getCondition());
    }









}
