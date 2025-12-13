public class ClinicTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Tymek",24,"Flu");
        Doctor doctor1 = new Doctor("Dr. Krawężnik", 67);
        Nurse nurse1 = new Nurse("Elżbieta Korek", 30);
        patient1.introduce();
        doctor1.introduce();
        nurse1.introduce();
        doctor1.performDuties();
        nurse1.performDuties();
        nurse1.checkVitals(patient1);
        patient1.receiveTreatment();
        doctor1.prescribeMedicine("Aspirin");

    }
}
