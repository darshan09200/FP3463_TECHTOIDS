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
}
