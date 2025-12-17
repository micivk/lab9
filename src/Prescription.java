import java.util.*;
public class Prescription {
    private List<Treatment> treatments;
    private Doctor doctor;
    private Patient patient;

    public Prescription(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.treatments = new ArrayList<>();
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public void printPrescription() {
        System.out.println("Prescription for: " + patient.getName() + " by Dr. " + doctor.getName());
        for (Treatment t : treatments) {
            System.out.println(" - " + t.toString());
        }
    }


}
