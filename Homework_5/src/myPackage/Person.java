package myPackage;

public class Person {
    public static int age;
    public static boolean isAdult;
    public static String firstName;
    public static String lastName;
    public static double height;
    public static boolean hasJob = false;
    public static boolean isStudent = false;

    private int getAge() {
        return age;
    }

    private void setAdult(boolean adult) {
        if (age <= 0) {
            return;
        }
        if (age < 18) {
            isAdult = false;
        } else {
            isAdult = true;
        }
    }

    private boolean isStudent() {
        return isStudent;
    }

    private void setStudent(boolean student) {
        isStudent = student;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private boolean isHasJob() {
        return hasJob;
    }

    private void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    private Person(int age, String firstName, String lastName, double height, boolean hasJob) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.hasJob = hasJob;
    }

    public Person() {
    }
}
