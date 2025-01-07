package library;

public class Teacher extends Member{

    private String teacherId;

    public Teacher(String name,
                   int age,
                   int money,
                   String teacherId){
        super(name, age, money);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    @Override
    public void memberType() {

    }

    @Override
    public void printInfo() {
        System.out.println("----------");
        System.out.println("Teacher details: ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Teacher ID: " + getTeacherId());
        System.out.println("Money: " + getMoney());
        System.out.println("----------");
    }
}
