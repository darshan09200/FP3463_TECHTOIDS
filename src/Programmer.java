public class Programmer extends Employee {
    private int nbProjects;

    public Programmer(String name, int birthYear, double occupationRate, int nbProjects) {
        super(name, birthYear, occupationRate, "Programmer");
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, int nbProjects) {
        this(name, birthYear, 100, nbProjects);
    }

    public int getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }
}
