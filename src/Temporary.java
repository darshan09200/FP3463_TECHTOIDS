public class Temporary implements Contract {

    private double hourlySalary;
    private double accumulatedHours;

    public Temporary(double hourlySalary, double accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getAccumulatedHours() {
        return accumulatedHours;
    }

    public void setAccumulatedHours(double accumulatedHours) {
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double getCumulativeSalary() {
        return hourlySalary * accumulatedHours;
    }

    @Override
    public String toString() {
        return " He/She is a temporary employee with $" + getHourlySalary() +
                " hourly salary and he has worked for " + getAccumulatedHours() + " hours ";
    }

}