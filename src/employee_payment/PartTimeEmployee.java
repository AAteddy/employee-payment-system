package employee_payment;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double paymentRate = 2.5;

    public PartTimeEmployee(String name, String address, double salary, String department, int hoursWorked) {
        super(name,address,salary);
        super.setSalary(salary);
        super.setDepartment(department);
        setHoursWorked(hoursWorked);
    }

    public void setPaymentRate(double newPaymentRate) {
        paymentRate = newPaymentRate;
    }

    public void setHoursWorked(int newHoursWorked) {
        if(newHoursWorked > 0)
            hoursWorked = newHoursWorked;
    }

    @Override
    public double computeSalary(double salary) {
        return paymentRate * hoursWorked;
    }
}
