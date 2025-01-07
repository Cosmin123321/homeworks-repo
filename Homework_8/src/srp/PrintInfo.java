package srp;

public class PrintInfo extends SalaryCalculator {
    public PrintInfo(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    public void printEmployeeInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("Salary: " + salaryCalculation());
    }
}
