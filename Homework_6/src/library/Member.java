package library;

public abstract class Member {

    private String name;
    private int age;
    private int money;

    public Member(String name,
                  int age,
                  int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    public abstract void memberType();
    public abstract void printInfo();

}
