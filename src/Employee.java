import java.time.LocalDate;

public class Employee {
    private String name;
    private int birthYear;
    private double occupationRate;
    private String role;

    private Vehicle vehicle;

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
        return Math.max(0, Math.min(occupationRate, 100));
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
        return 0;
    }

    public double getAnnualIncome() {
        return getMonthlyIncome() * 12 * (getOccupationRate() / 100);
    }

    @Override
    public String toString() {
        return "Name:" + getName() + ",a " + getRole() + "\n" + "Age: " + getAge() + "\n" + getName() + " has an Occupation rate: " + getOccupationRate() + "%";
    }
}
