package library;

public class Student extends Member{

    private String studentId;

    public Student(String name,
                   int age,
                   int money,
                   String studentId){
        super(name, age, money);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void memberType() {
    }

    @Override
    public void printInfo() {
        System.out.println("----------");
        System.out.println("Student details: ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Money: " + getMoney());
        System.out.println("----------");
    }
}
