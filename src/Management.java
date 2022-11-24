import java.util.ArrayList;

public class Management {
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
        employeeList.add(new Manager("Serge", 1985, 4, 30));
        employeeList.add(new Manager("Cindy", 1974, 80, 6, 20));
        employeeList.add(new Programmer("Paul", 1993, 75, 3));
        employeeList.add(new Tester("Pierre", 1987, 50, 124));
        employeeList.add(new Programmer("Matt", 1981, 110, 5));
        employeeList.add(new Programmer("Sarah", 1986, 3));

        for (Employee employee : employeeList) {
            System.out.println("--------------------------------");
            System.out.println(employee);
            System.out.println("--------------------------------");
        }
    }
}
