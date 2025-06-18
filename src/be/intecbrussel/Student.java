package be.intecbrussel;

public class Student extends Person{
    private static int incrementId;
    int id ;

    public Student (){
        super();
        id = getIncrementId();
    }

    public Student(String lastName, String name) {
        super(lastName, name);
        id = getIncrementId();


    }

    private static int getIncrementId(){
        return ++incrementId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
