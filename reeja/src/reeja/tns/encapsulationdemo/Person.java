package reeja.tns.encapsulationdemo;

public class Person {
    // Private fields for encapsulation
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person();

        // Using setter methods to set values
        person.setName("Alice");
        person.setAge(30);

        // Using getter methods to retrieve values
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());
    }
}
