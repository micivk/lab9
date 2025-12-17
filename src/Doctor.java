public class Doctor extends Staff {

    public Doctor(String name, int age){
        super(name,age,"Doctor");
    }


    @Override
    public void performDuties() {
        System.out.println("Diagnosing patient conditions and reviewing medical charts.");
    }

    public void prescribeMedicine(String medicine){
        System.out.println(this.getName()+ " prescribes: " + medicine);
    }
}
