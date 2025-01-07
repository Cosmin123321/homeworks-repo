package ocp;

public class VIP extends DiscountCalculator {
    private final String customerType = "VIP";
    private String name;
    private final double vipDiscount = 0.3;

    public VIP(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getVipDiscount() {
        return vipDiscount;
    }


    public double calculateDiscount () {
        return price * vipDiscount;
    }

    public void printInfo() {
        System.out.println("Type: " + customerType);
        System.out.println("Name: " + getName());
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("---");
    }
}
