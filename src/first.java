package yadav;

//class Animal {
//    void eat() {
//        System.out.println("Eating...");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Barking...");
//    }
//}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class first {
    public static void main(String[] args) {

//        Dog d = new Dog();
//        d.eat();
//        d.bark();

        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(5, 3));
        System.out.println("Sum (double): " + calc.add(2.5, 3.7));
    }
}