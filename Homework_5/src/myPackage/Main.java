package myPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data\n------------------------------");
        Person myPerson = new Person();


        System.out.print("Enter the age: ");
        myPerson.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the first name: ");
        myPerson.firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        myPerson.lastName = sc.nextLine();
        System.out.print("Enter the height: ");
        myPerson.height = sc.nextDouble();
        System.out.print("------------------------------");


        System.out.println("Is the person a student ? (y/n)");
        char inputStudent = sc.next().charAt(0);
        if (inputStudent == 'y' || inputStudent == 'Y') {
            Person.isStudent = true;
            Student myStudent = new Student();

            myStudent.a1 = myPerson.firstName.charAt(0);
            myStudent.a2 = myPerson.lastName.charAt(0);

            //        myStudent.initials = myStudent.firstName.charAt(0); //can't get rid of null
            //        myStudent.initials += myStudent.lastName.charAt(0);
        }

        if (Person.age >= 18) {

            System.out.println("Does the person have a job ? y/n");
            char inputJob = sc.next().charAt(0);

            if (inputJob == 'y' || inputJob == 'Y') {
                Person.hasJob = true;
                Job myJob = new Job();

                System.out.print("Enter the job's name: ");
                myJob.jobName = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter the amount of hours worked/day: ");
                myJob.hoursDay = sc.nextInt();
                System.out.print("Enter the amount of free days/year: ");
                myJob.freeDays = sc.nextInt();
                System.out.print("Enter the salary: ");
                myJob.payment = sc.nextInt();
        sc.nextLine();
                System.out.print("Enter the currency you're paid in (euros/dollars/pounds): ");
                String currencyPicker = sc.nextLine();
                myJob.currencyPicker = currencyPicker.charAt(0);
                if (myJob.currencyPicker == 'd' || myJob.currencyPicker == 'D') {
                    myJob.currencyPicked = "$";
                } else if (myJob.currencyPicker == 'e' || myJob.currencyPicker == 'E') {
                    myJob.currencyPicked = "€";
                } else if (myJob.currencyPicker == 'p' || myJob.currencyPicker == 'P') {
                    myJob.currencyPicked = "£";
                }

                myJob.printAllInfo();
            }
        }
    }
}
