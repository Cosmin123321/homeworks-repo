package lsp;

public class BirdFlying extends Bird{
    protected BirdFlying(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The bird can eat");
    }

    @Override
    public void sleep() {
        System.out.println("The bird can sleep");
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
}
