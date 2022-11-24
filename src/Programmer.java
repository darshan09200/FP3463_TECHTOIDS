public class Programmer extends Employee {
    private int nbProjects;

    public Programmer(String name, int birthYear, double occupationRate, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, occupationRate, "Programmer", vehicle);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, double occupationRate, int nbProjects) {
        this(name, birthYear, occupationRate, nbProjects, null);
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        this(name, birthYear, 100, nbProjects, vehicle);
    }

    public Programmer(String name, int birthYear, int nbProjects) {
        this(name, birthYear, 100, nbProjects, null);
    }

    public int getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }
}
