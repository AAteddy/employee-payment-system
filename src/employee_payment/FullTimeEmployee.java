package employee_payment;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, String address, double salary, String department) {
        super(name,address,salary);
        super.setDepartment(department);
    }

    @Override
    public double computeSalary(double salary) {
        return salary;
    }
}
