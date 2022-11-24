public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;


    public Manager(String name, int birthYear, double occupationRate, int nbTravelDays, int nbClients, Vehicle vehicle) {
        super(name, birthYear, occupationRate, "Manager", vehicle);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }


    public Manager(String name, int birthYear, double occupationRate, int nbTravelDays, int nbClients) {
        this(name, birthYear, occupationRate, nbTravelDays, nbClients, null);
    }

    public Manager(String name, int birthYear, int nbTravelDays, int nbClients, Vehicle vehicle) {
        this(name, birthYear, 100, nbTravelDays, nbClients, vehicle);
    }

    public Manager(String name, int birthYear, int nbTravelDays, int nbClients) {
        this(name, birthYear, 100, nbTravelDays, nbClients, null);
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

    @Override
    public String toString() {
        String desc = super.toString();
        desc += ". He/She has bought " + nbClients + " new clients.\nHis/Her estimated annual income is $" + getAnnualIncome();
        return desc;
    }

}
