public class Motorcycle extends Vehicle{
    private boolean sidecar;

    public Motorcycle(String make, String plate, String color, String category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {

        String desc = "Employee has a motorcycle. \n\t- make: " + getMake() +
                "\n\t- plate: "+ getPlate() + "\n\t- color: " + getColor() + "\n\t- category: " + getCategory();
        if (isSidecar()) {
            desc += "\n\t- with sidecar";
        }
        else {
            desc += "\n\t- without sidecar";
        }
        return desc;
    }
}
