public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, double occupationRate, int nbBugs) {
        super(name, birthYear, occupationRate, "Tester");
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }
}
