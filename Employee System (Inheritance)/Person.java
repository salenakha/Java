package InheritanceLab;

public abstract class Person {
    //this class is ABSTRACT in order to make the getRole() method ABSTRACT
    //this allows getRole() to be implemented separately in Employee and Manager
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public abstract String getRole();

    // getters and setters for name, age, and id
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Name: " + getName() + ", ID: " + getId() + ", Age: " + getAge();
    }
}
