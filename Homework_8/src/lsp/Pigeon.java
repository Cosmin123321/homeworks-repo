package lsp;

public class Pigeon extends BirdFlying{

    protected Pigeon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is Flying");
    }

}
