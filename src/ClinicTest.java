import java.time.LocalDateTime;
import java.util.Arrays;

public class ClinicTest {
    public static void main(String[] args) {

        Clinic myClinic = new Clinic();


        Doctor d1 = new Doctor("Dr. Marek", 23);
        Receptionist r1 = new Receptionist("Jola", 30);
        Patient p1 = new Patient("Tymek", 40, "Flu");
        Patient p2 = new Patient("Maja", 25, "Headache");


        myClinic.addDoctor(d1);
        myClinic.addPatient(p1);
        myClinic.addPatient(p2);


        LocalDateTime t1 = LocalDateTime.of(2026, 10, 26, 12, 0);
        r1.makeAppointment(d1, p1, t1);


        Medicine med1 = new Medicine("Ibuprofen", 200);
        Medicine med2 = new Medicine("Syrup", 100);
        d1.prescribeMedicine(p1, Arrays.asList(med1));
        d1.prescribeMedicine(p2, Arrays.asList(med1, med2));



        d1.printSchedule();


        p1.showHistory();


        myClinic.findPatientsByMedicine("Ibuprofen");

        myClinic.findPatientsByMedicine("Syrup");
    }
}
