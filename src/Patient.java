public class Patient extends Person implements Treatable{

    private String condition;

    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void receiveTreatment(){
        System.out.println("Patient " + getName() + " is being treated for: " + getCondition());
    }

}



