package InheritanceLab;

public class Employee extends Person{
    //** because Person has abstract getRole(), implement getRole() here
    private double salary;//get the salary of the Employee
    private Manager manager;

    public Employee(String name, int age, String id, double salary, Manager manager) {
        super(name, age, id);
        this.salary = salary;
        this.manager = manager;
    }

    public String getRole(){
        return "Employee";
        //when user.Equals this in the system class,
        //it knows the user is Employee
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager getManager(){
        return manager;
    }

    public String toString() {
        return "Name: " + getName() + ", ID: " + getId() + ", Age: " + getAge()+ ", Salary: " + this.salary;
    }
}
