public class Receptionist extends Staff{

    public Receptionist(String name, int age) {
        super(name,age, "Receptionist");
    }
    public void performDuties() {
        System.out.println("Registering new patients and scheduling appointments.");
    }
    public void registerPatient(Patient patient) {
        System.out.println("Receptionist " + this.name + " registers patient: " + patient.name);
    }
}
