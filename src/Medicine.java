public class Medicine extends Treatment {
    private double dosage;

    public Medicine(String name, double dosage) {
        super(name);
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medicine: " + getDescription() + " (" + dosage + "mg)";
    }
}
