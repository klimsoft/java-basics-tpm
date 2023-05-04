package org.example.ex11;

public class Employee extends Person {
    private String employeeId;
    private int salary;

    public Employee(String name, int age, String employeeId, int salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getDetails() {
        return super.getDetails() + ", employeeId: " + employeeId + ", salary: " + salary;
    }
}
