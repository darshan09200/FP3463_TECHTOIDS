public class Manager extends Employee{
    private int nbTravelDays;
    private int nbClients;

    public Manager(String name, int birthYear, double occupationRate, int nbTravelDays, int nbClients) {
        super(name, birthYear, occupationRate, "Manager");
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public void setNbTravelDays(int nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }
}
