import java.util.ArrayList;

public class Management {

    Motorcycle motorcycle1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle", false);
    Motorcycle motorcycle2 = new Motorcycle("Honda", "Custom Plate", "Black", "Not For Race", true);
    Car car1 = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
    Car car2 = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
    Car car3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
    Car car4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");

    public void testCase1() {
        new Manager("Serge", 1985, 4, 30);
        new Manager("Cindy", 1974, 80, 6, 20);
        new Programmer("Paul", 1993, 75, 3);
        new Tester("Pierre", 1987, 50, 124);
        new Programmer("Matt", 1981, 110, 5);
        new Programmer("Sarah", 1986, 3);
    }

    public void testCase2() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Manager("Serge", 1985, 4, 30, car1));
        employeeList.add(new Manager("Cindy", 1974, 80, 6, 20, car2));
        employeeList.add(new Programmer("Paul", 1993, 75, 3, motorcycle1));
        employeeList.add(new Tester("Pierre", 1987, 50, 124, motorcycle2));
        employeeList.add(new Programmer("Matt", 1981, 110, 5, car4));
        employeeList.add(new Programmer("Sarah", 1986, 3, car3));

        for (Employee employee : employeeList) {
            System.out.println("--------------------------------");
            System.out.println(employee);
            System.out.println("--------------------------------");
        }
    }
}
