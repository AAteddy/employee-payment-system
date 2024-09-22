package employee_payment;

public abstract class Employee {
    private String name, address, department;
    private short age;
    private int phoneNumber;
    private static int employeeId;
    private double salary;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public void setSalary(double newSalary) {
        if(newSalary > 1.0)
            salary = newSalary;
        else
            salary = 1.0;
    }

    public abstract double computeSalary(double salary);





}
