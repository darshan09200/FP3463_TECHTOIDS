public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, double occupationRate, int nbBugs, Vehicle vehicle) {
        super(name, birthYear, occupationRate, "Tester", vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, double occupationRate, int nbBugs) {
        this(name, birthYear, occupationRate, nbBugs, null);
    }

    public Tester(String name, int birthYear, int nbBugs, Vehicle vehicle) {
        this(name, birthYear, 100, nbBugs, vehicle);
    }

    public Tester(String name, int birthYear, int nbBugs) {
        this(name, birthYear, 100, nbBugs, null);
    }


    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }
}
