abstract class Staff extends Person {

    String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }


    public abstract void performDuties();


}
