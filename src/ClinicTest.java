public class ClinicTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Tymek",24,"Flu");
        Doctor doctor1 = new Doctor("Dr. Krawężnik", 67);
        patient1.introduce();
        doctor1.introduce();
        doctor1.performDuties();
        patient1.receiveTreatment();
        doctor1.prescribeMedicine("Aspirin");

    }
}
