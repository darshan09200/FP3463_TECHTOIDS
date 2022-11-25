public class Manager extends Employee {
    static final double GAIN_FACTOR_TRAVEL = 100;
    static final double GAIN_FACTOR_CLIENT = 500;
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
        this(name, birthYear, DEFAULT_OCCUPATION_RATE, nbTravelDays, nbClients, vehicle);
    }

    public Manager(String name, int birthYear, int nbTravelDays, int nbClients) {
        this(name, birthYear, DEFAULT_OCCUPATION_RATE, nbTravelDays, nbClients, null);
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
    public double getAnnualIncome() {
        return super.getAnnualIncome() + (nbClients * GAIN_FACTOR_CLIENT) + (nbTravelDays * GAIN_FACTOR_TRAVEL);
    }

    @Override
    public String toString() {
        String desc = super.toString();
        desc += ". He/She has bought " + nbClients + " new clients.\nHis/Her estimated annual income is $" + getAnnualIncome();
        return desc;
    }

}
