package be.intecbrussel;

public class Person {
    String name;
    String lastName;

    public Person (){}

    public Person(String lastName, String name) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }
}
