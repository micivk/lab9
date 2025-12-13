public class ClinicTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Tymek",24,"Flu");
        Doctor doctor1 = new Doctor("Dr. Krawężnik", 67);
        Nurse nurse1 = new Nurse("Elżbieta Korek", 30);
        Receptionist receptionist1 = new Receptionist("Genowefa Pistacja", 46);



        Staff[] Staff = {receptionist1, nurse1, doctor1};

        for(Staff s : Staff){
            s.introduce();
            s.performDuties();
        }


        patient1.introduce();

        nurse1.checkVitals(patient1);
        patient1.receiveTreatment();
        doctor1.prescribeMedicine("Aspirin");

    }
}
