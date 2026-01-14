import java.util.*;
public class Patient extends Person implements Treatable{

    private String condition;

    private List<Prescription> prescriptions;
    private List<Appointment> appointments;

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }


    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
        this.appointments = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    public String getCondition() {
        return condition;
    }

    public void addPrescription(Prescription p) {
        prescriptions.add(p);
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public void showHistory() {
        System.out.println("History for " + getName() + ":");
        System.out.println("Appointments:");
        for (Appointment a : appointments) {
            System.out.println(" - " + a.toString());
        }
        System.out.println("Prescriptions:");
        for (Prescription p : prescriptions) {
            p.printPrescription();
        }
    }

    public void receiveTreatment(){
        System.out.println("Patient " + getName() + " is being treated for: " + getCondition());
    }




}



