package srp;

/**
 * Refactor the Employee class to adhere to SRP.
 * Split responsibilities into separate classes.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        PrintInfo employee = new PrintInfo("John", 50, 15);
        employee.printEmployeeInfo();

    }
}