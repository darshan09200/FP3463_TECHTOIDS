public class Employee {
    private String name;
    private int birthYear;
    private double occupationRate;
    private String role;

    public Employee(String name, int birthYear, double occupationRate, String role) {
        this.name = name;
        this.birthYear = birthYear;
        this.occupationRate = occupationRate;
        this.role = role;
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

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        this.occupationRate = occupationRate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
