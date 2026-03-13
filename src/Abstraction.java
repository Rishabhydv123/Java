//abstract class Vehicle {
//    abstract void start();
//}
//
//class Car extends Vehicle {
//    void start() {
//        System.out.println("Car starts with key");
//    }
//}
//
//public class Abstraction {
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.start();
//    }
//}

//interface Animal
//{
//    void sound();
//}
//class Dog implements Animal
//{
//    public void sound()
//    {
//        System.out.println("Dog barks");
//    }
//}
//public class Abstraction
//{
//    public static void main(String[] args)
//    {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

final class Employee {
    private final String name;
    private final int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Employee d = new Employee("hello" , 2);
        System.out.println(d.getName());
        System.out.println(d.getId());
    }
}