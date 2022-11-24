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
    public void testCase3() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee Serge = new Manager("Serge", 1985, 4, 30, car1);
        Employee Cindy = new Manager("Cindy", 1974, 80, 6, 20, car2);
        Employee Paul = new Programmer("Paul", 1993, 75, 3, motorcycle1);
        Employee Pierre = new Tester("Pierre", 1987, 50, 124, motorcycle2);
        Employee Matt = new Programmer("Matt", 1981, 110, 5, car4);
        Employee Sarah = new Programmer("Sarah", 1986, 3, car3);
        Permanent permanent1 = new Permanent(2,true,6000,200,17);
        Permanent permanent2 = new Permanent(3,false,5000,150,19);
        Temporary temporary1 = new Temporary(60,30);
        Temporary temporary2 = new Temporary(50,60);
        Permanent permanent3 = new Permanent(1,true,4000,100,20);
        Permanent permanent4 = new Permanent(4,true,4500,100,19);
        Serge.signContract(permanent1);
        Cindy.signContract(permanent2);
        Paul.signContract(temporary1);
        Matt.signContract(temporary2);
        Pierre.signContract(permanent3);
        Sarah.signContract(permanent4);
        employeeList.add(Serge);
        employeeList.add(Cindy);
        employeeList.add(Paul);
        employeeList.add(Pierre);
        employeeList.add(Matt);
        employeeList.add(Sarah);
        for(Employee employee : employeeList) {
            System.out.println("--------------------------------");
            System.out.println(employee);
            System.out.println("--------------------------------");
        }
        System.out.println("--------------------------------");
        System.out.println("Contracts:-");
        System.out.println("--------------------------------");
        for(Employee employee : employeeList) {
            Contract contract = employee.getContract();
            System.out.println(employee.contractInfo() + contract);
            System.out.println("--------------------------------");
        }
        Permanent permanent5 = new Permanent(1,true,5000,200,30);
        Matt.signContract(permanent5);
        System.out.println("--------------------------------");
        System.out.println("Contracts:-");
        System.out.println("--------------------------------");
        for(Employee employee : employeeList) {
            Contract contract = employee.getContract();
            System.out.println(employee.contractInfo() + contract);
            System.out.println("--------------------------------");
        }

    }
}
