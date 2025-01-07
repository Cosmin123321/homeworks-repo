package srp;

public class SalaryCalculator extends Employee{


    public SalaryCalculator(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    public double salaryCalculation () {
        return getHoursWorked() * getHourlyRate();
    }
}
