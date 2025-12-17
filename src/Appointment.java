import java.time.LocalDateTime;

public class Appointment {
    private LocalDateTime dateTime;
    private Patient patient;
    private Doctor doctor;

    public Appointment(LocalDateTime dateTime, Patient patient, Doctor doctor) {
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Appointment on " + dateTime + " with Dr. " + doctor.getName();
    }
}
