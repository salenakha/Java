package InheritanceLab;
import java.util.ArrayList;

public class Manager extends Person {
    private ArrayList<Employee> employees;


    public Manager(String name, int age, String id, ArrayList<Employee> employees) {
        super(name, age, id);
        this.employees = employees;
    } //the manager should inherit the name age id of Person and also have a list of employees

    //getters
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(String id) {
        for (Employee emp : employees) {
            if (emp.getId().equals(id)) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    public Employee findEmployee(String employeeID) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeID)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    public boolean giveRaise(String employeeId, double amount) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                employee.setSalary(employee.getSalary() + amount);
                return true;
            }
        }
        return false;
    }

    public String getRole(){
        return "Manager";
    }
    public String toString() {
        return "Name: " + getName() + ", ID: " + getId() + ", Age: " + getAge();
    }
}