public class Treatment {
    private String description;

    public Treatment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Treatment: " + description;
    }
}
