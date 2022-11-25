public class Permanent implements Contract {
    static double WORKING_DAYS = 20;
    private int noOfChildren;
    private boolean married;
    private double monthlySalary;
    private double bonusPerMonth;
    private int accumulatedDays;

    public Permanent(int noOfChildren, boolean married, double monthlySalary, double bonusPerMonth, int accumulatedDays) {
        this.noOfChildren = noOfChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerMonth = bonusPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonusPerMonth() {
        return bonusPerMonth;
    }

    public void setBonusPerMonth(double bonusPerMonth) {
        this.bonusPerMonth = bonusPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public void setAccumulatedDays(int accumulatedDays) {
        this.accumulatedDays = accumulatedDays;
    }

    public double getCumulativeSalary() {
        double baseSalary = getMonthlySalary();
        if (isMarried()) {
            baseSalary += (getBonusPerMonth() * getNoOfChildren());
        }
        return getAccumulatedDays() * baseSalary / Permanent.WORKING_DAYS;
    }
    @Override
    public String toString() {
        String desc = " He/She is ";
        if (!isMarried()) {
            desc += "not ";
        }
        desc += "married and he / she has " + getNoOfChildren() + " children.\n" +
                "He / She has worked for " + getAccumulatedDays() + " days and upon contract his / her monthly salary is $" + getMonthlySalary() + ". ";
        return desc;
    }
}
