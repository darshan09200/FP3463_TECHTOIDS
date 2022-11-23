public class Manager extends Employee{
    private int nbTravelDays;
    private int nbClients;

    public Manager(String name, int birthYear, double occupationRate, String role, int nbTravelDays, int nbClients) {
        super(name, birthYear, occupationRate, role);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }
    
}
