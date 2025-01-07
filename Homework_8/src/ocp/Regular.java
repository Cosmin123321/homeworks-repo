package ocp;

public class Regular extends DiscountCalculator {
    private final String customerType = "Reg";
    private String name;
    private final double regularDiscount = 0.1;

    public Regular(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRegularDiscount() {
        return regularDiscount;
    }


    public double calculateDiscount () {
        return price * regularDiscount;
    }

    public void printInfo() {
        System.out.println("Type: " + customerType);
        System.out.println("Name: " + getName());
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("---");
    }

}
