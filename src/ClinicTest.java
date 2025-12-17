import java.time.LocalDateTime;
import java.util.*;

public class ClinicTest {
    public static void main(String[] args) {

        Patient p1 = new Patient("Tymek", 24, "Flu");
        Doctor d1 = new Doctor("Dr. tym", 50);

        LocalDateTime visitTime = LocalDateTime.of(2025, 12, 20, 14, 0);

        d1.scheduleAppointment(p1, visitTime);


        Patient p2 = new Patient("Maja", 30, "Cold");
        d1.scheduleAppointment(p2, visitTime);


        Medicine med1 = new Medicine("Aspirin", 500);
        Treatment treat1 = new Treatment("Bed rest");

        d1.prescribeMedicine(p1, Arrays.asList(med1, treat1));


        p1.showHistory();


    }
}
