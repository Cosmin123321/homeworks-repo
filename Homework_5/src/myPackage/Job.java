package myPackage;

public class Job {
    public String jobName;
    public int hoursDay;
    public int freeDays;
    public int payment;
    public char currencyPicker;
    public String currencyPicked;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getHoursDay() {
        return hoursDay;
    }

    public void setHoursDay(int hoursDay) {
        this.hoursDay = hoursDay;
    }

    public int getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public char getCurrency() {
        return currencyPicker;
    }

    public void setCurrency(char currency) {
        this.currencyPicker = currency;
    }

    public void printAllInfo() {
        System.out.println("------------------------------\n" +
                "------------------------------\n"
                + "Person's info");
        System.out.println("Name: " + Person.firstName);
        System.out.println("Family name: " + Person.lastName);
        System.out.println("Initials: " + Student.a1 + Student.a2);
        System.out.println(Person.firstName + " " + Person.lastName + "'s age is " + Person.age);
        System.out.println("Height is " + Person.height);
        System.out.println("------------------------------");
        if (Person.age >= 18) {
            Person.isAdult = true;
            System.out.println("The person is an adult");
        } else {
            System.out.println("The person is not an adult");
        }
        if (Person.isStudent) {
            System.out.println("The person is a student");
        } else {
            System.out.println("The person is not a student");
        }
        if (Person.hasJob) {
            System.out.println("The person has a job");
        } else {
            System.out.println("The person doesn't have a job");
        }
        System.out.println("------------------------------");
        if (Person.isAdult && Person.hasJob) {
            System.out.println("Job name: " + jobName);
            System.out.println("Hours worked/day: " + hoursDay);
            System.out.println("Free days/year: " + freeDays);
            System.out.println("Salary: " + payment + " " + currencyPicked);
        }
    }
}
