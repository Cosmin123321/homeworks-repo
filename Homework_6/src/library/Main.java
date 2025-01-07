package library;

public class Main {
    public static void main(String[] args) {

        Member studentMember = new Student("John Doe", 20, 10,"12344321");
        Member teacherMember = new Teacher("Jane Doe", 40, 500,"abc123321");

        studentMember.printInfo();
        teacherMember.printInfo();

        Book studentBook = new Book ("BookTitle_1", "UnknownFirstAuthor",
                studentMember, 25);
        Book teacherBook = new Book ("BookTitle_2", "UnknownAnotherAuthor",
                teacherMember, 30);

        studentBook.rentBook(30);
        studentBook.returnBook(15);

        teacherBook.rentBook(50);
        teacherBook.returnBook(25);

        studentBook.printBook();
        teacherBook.printBook();
    }
}
