package ocp;

public class Student extends DiscountCalculator{
    private final String customerType = "Stud";
    private String name;
    private final double studentDiscount = 0.2;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getStudentDiscount() {
        return studentDiscount;
    }


    public double calculateDiscount () {
        return price * studentDiscount;
    }

    public void printInfo() {
        System.out.println("Type: " + customerType);
        System.out.println("Name: " + getName());
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("---");
    }
}
