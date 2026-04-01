class Student {
    String name;
    int age;

   public void study() {
        System.out.println("I am " + name);
    }

    public void study1() {
        System.out.println("I am " + age);
    }
}

public class Main {
   public static void main(String[] args) {
        Student s1 = new Student();
       s1.name = "Rishabh";
        s1.age = 21;
        s1.study();
       s1.study1();
    }
}


