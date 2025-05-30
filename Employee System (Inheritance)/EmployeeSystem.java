package InheritanceLab;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem { //main method of the program
    public static void main(String[] args) {
        //create managers and employees
        EmployeeSystem e = new EmployeeSystem();

        Manager m1 = new Manager("Jane Smith", 30, "MG001", new ArrayList<Employee>());
        Manager m2 = new Manager("Wesley Lane", 34, "MG002", new ArrayList<Employee>());

        Employee emp1 = new Employee("Jane Doe", 32, "EMPL001", 100000, m1);
        Employee emp2 = new Employee("Bob Johnson", 41, "EMPL002", 80000, m1);
        Employee emp3 = new Employee("Wynne Dawn", 22, "EMPL003", 50000, m2);
        Employee emp4 = new Employee("David Beck", 25, "EMPL004", 55000, m2);


        m1.addEmployee(emp1);
        m1.addEmployee(emp2);
        m2.addEmployee(emp3);
        m2.addEmployee(emp4);

        e.addPerson(emp1);
        e.addPerson(emp2);
        e.addPerson(emp3);
        e.addPerson(emp4);
        e.addPerson(m1);
        e.addPerson(m2);

        //begin scanner to ask the user to give their ID
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Log In ID: ");
        String id = s.nextLine();
        Person user = e.returnPersonID(id); //the ID given will indicate if the perosn is employee or manager
        if (user == null) {
            System.out.println("Invalid. There is no user with that ID. ");
            return;
        }
        //now, based on if the user is an employee or manager:
        String userRole = user.getRole();
        if (userRole.equals("Employee")) { //if the user is an Employee
            //cases
            int choice = 0;
            while (choice != 3) {
                System.out.println("Hello, Employee " + user.getName());
                System.out.println("Select an option:");
                System.out.println("1. View my current salary");
                System.out.println("2. View information about my Manager");
                System.out.println("3. Logout");

                choice = s.nextInt();
                s.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Your current salary is: " + ((Employee) user).getSalary());
                        break;
                    case 2:
                        Manager manager = ((Employee) user).getManager();
                        System.out.println("Manager Name: " + manager.getName());
                        System.out.println("Manager Age: " + manager.getAge());
                        System.out.println("Manager ID: " + manager.getId());
                        break;
                    case 3:
                        System.out.println("Logging out...");
                        break;
                }
            }

        } else if (userRole.equals("Manager")) { //if the user is a Manager
            //cases
            Manager manager = (Manager) user;
            int choice = 0;
            while (choice != 5) {
                System.out.println("Hello, Manager " + user.getName());
                System.out.println("Select an option: ");
                System.out.println("1. Add a new employee");
                System.out.println("2. Print information of all employees");
                System.out.println("3. Fire an employee");
                System.out.println("4. Give an employee a raise");
                System.out.println("5. Logout");

                choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1: //gather all the information for a new employee
                        System.out.print("Enter the employee's name: ");
                        String name = s.nextLine();
                        System.out.print("Enter the employee's age: ");
                        int age = s.nextInt();
                        System.out.print("Enter the employee's ID: ");
                        String employeeId = s.next();
                        System.out.print("Enter the employee's salary: ");
                        int salary = s.nextInt();
                        s.nextLine();

                        //create a new employee, and add them to the employee list
                        Employee employee = new Employee(name, age, employeeId, salary, manager);
                        manager.addEmployee(employee);
                        System.out.println("Employee added successfully.");
                        break;

                    case 2:
                        System.out.println("Information of all employees:");
                        for (Employee employees : manager.getEmployees()) {
                            System.out.println(employees.toString()); //toString() prints all of their information
                        }
                        break;

                    case 3:
                        System.out.print("Enter the ID of the employee to fire: ");
                        String id2 = s.next();
                        boolean removed = manager.removeEmployee(id2); //remove employee, then sets to true
                        if (removed) {
                            System.out.println("Employee with ID " + id2 + " has been fired.");
                        } else {
                            System.out.println("Employee with ID " + id2 + " not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter the ID of the employee to give a raise: ");
                        String employeeId2 = s.nextLine();
                        Employee employee2 = manager.findEmployee(employeeId2);
                        if (employee2 != null) {
                            System.out.print("Enter the amount of the raise: ");
                            int raise = s.nextInt();
                            manager.giveRaise(employeeId2, raise);
                            System.out.println("Employee with ID " + employeeId2 + " has been given a raise of " + raise + ". "
                                    + "Their salary is now: $" + employee2.getSalary());
                        } else {
                            System.out.println("Employee with ID " + employeeId2 + " not found.");
                        }
                        break;

                    case 5:
                        System.out.println("Logging out...");
                        break;
                }
            }
        }
    }

    private ArrayList<Person> people; //list of person objects

    public EmployeeSystem() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person returnPersonID(String id) {
        //when the person enters their ID in the system,
        //this method will be called to find it
        for (Person person : people) {
            if (person.getId().equals(id)) {
                //for each person, get their ID (from Person)
                return person;
            }
        }
        return null;
    }
}
