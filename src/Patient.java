public class Patient extends Person implements Treatable{

    String condition;

    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public void receiveTreatment(){
        System.out.println("Patient " + this.name + " is being treated for: " + this.condition);
    }

}



