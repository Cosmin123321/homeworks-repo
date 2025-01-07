package ocp;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */
public class Main {

    public static void main(String[] args) {

        Regular newRegular = new Regular("John");
        VIP newVip = new VIP("Bob");
        Student newStudent = new Student("Jeff");

        newRegular.printInfo();
        newVip.printInfo();
        newStudent.printInfo();

    }

}