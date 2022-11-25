import java.time.LocalDate;

public abstract class Employee {
    static final double DEFAULT_OCCUPATION_RATE = 100;
    private final String name;
    private int birthYear;
    private double occupationRate;
    private String role;

    private final Vehicle vehicle;

    Contract contract;

    public Employee(String name, int birthYear, double occupationRate, String role, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.occupationRate = formatOccupationRate(occupationRate);
        this.role = role;
        this.vehicle = vehicle;

        System.out.println("We have a new employee: " + getName() + ", a " + getRole() + ".");
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - birthYear;
    }

    static double formatOccupationRate(double occupationRate) {
        return Math.max(0, Math.min(occupationRate, DEFAULT_OCCUPATION_RATE));
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        this.occupationRate = formatOccupationRate(occupationRate);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getMonthlyIncome() {
        double monthlySalary = 0;
        if (contract != null) {
            monthlySalary = contract.getCumulativeSalary();
        }
        return monthlySalary;
    }

    public double getAnnualIncome() {
        return getMonthlyIncome() * 12 * (getOccupationRate() / 100);
    }

    @Override
    public String toString() {
        String desc =  "Name:" + getName() + ",a " + getRole() + "\n" + "Age: " + getAge() + "\n" ;
        if(vehicle != null) {
            desc += vehicle + "\n";
        }
        return desc + getName() + " has an Occupation rate: " + getOccupationRate() + "%";
    }

    public void signContract(Contract contract) {
        this.contract = contract;
    }
    public Contract getContract() {
        return contract;
    }
    public String contractInfo() {
        return getName() + " is a " + getRole().toLowerCase() + ".";
    }
}
