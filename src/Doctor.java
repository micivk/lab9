import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDateTime;

public class Doctor extends Staff {

    private List<Appointment> appointments;

    public Doctor(String name, int age){
        super(name,age,"Doctor");
        this.appointments = new ArrayList<>();
    }


    @Override
    public void performDuties() {
        System.out.println("Diagnosing patient conditions and reviewing medical charts.");
    }

    public boolean scheduleAppointment(Patient patient, LocalDateTime dateTime) {

        for (Appointment existing : appointments) {
            if (existing.getDateTime().equals(dateTime)) {
                System.out.println("Error: Doctor " + getName() + " is busy at " + dateTime);
                return false;
            }
        }

        Appointment newAppt = new Appointment(dateTime, patient, this);


        this.appointments.add(newAppt);

        patient.addAppointment(newAppt);

        System.out.println("Success: Appointment scheduled for " + patient.getName() + " on " + dateTime);
        return true;
    }


    public void prescribeMedicine(Patient patient, List<Treatment> treatments) {
        Prescription p = new Prescription(this, patient);
        for (Treatment t : treatments) {
            p.addTreatment(t);
        }
        patient.addPrescription(p);
        System.out.println(getName() + " issued a prescription for " + patient.getName());
    }

    public void printSchedule() {
        System.out.println("Schedule for Dr. " + getName() + ":");
        appointments.sort(Comparator.comparing(Appointment::getDateTime));
        for (Appointment app : appointments) {
            System.out.println(" - " + app.getDateTime() + " with " + app.getPatient().getName());
        }
    }



    }

