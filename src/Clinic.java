import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Clinic() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }


    public void findPatientsByMedicine(String medicineName) {
        System.out.println("\n--- Search Results for medicine: " + medicineName + " ---");
        boolean found = false;

        for (Patient p : patients) {
            for (Prescription pres : p.getPrescriptions()) {
                for (Treatment t : pres.getTreatments()) {
                    if (t instanceof Medicine) {
                        if (t.getDescription().equalsIgnoreCase(medicineName)) {
                            System.out.println("Patient: " + p.getName() +
                                    " | Prescribed by: Dr. " + pres.getDoctor().getName());
                            found = true;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No patients found with this prescription.");
        }
    }
}