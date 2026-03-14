package Basics;


//                       1. Local Variables

//A local variable is declared inside a method, constructor, or block and can be used only within that block.

//Characteristics
//Declared inside methods or blocks { }
//Scope limited to that method/block
//Must be initialized before use
//Stored in stack memory

//public class Variables {
//    public  void Display(){
//        int number = 10;
//        System.out.println(number);
//    }
//    public static void main(String[] args){
//        Variables obj = new Variables();
//        obj.Display();
//    }
//}

//Explanation:-
//number is declared inside the display() method.
//It cannot be accessed outside the method.

/// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                                 2. Instance Variables
//An instance variable is declared inside a class but outside methods and belongs to an object of the class.
//Characteristics
//Declared inside class but outside methods
// Each object gets its own copy
// Default values are assigned automatically
// Stored in heap memory


//public class Variables {
//    int age;
//    String name;
//
//    void display(){
//        System.out.println(age + " " + name);
//    }
//
//    public static void main(String[] args){
//        Student s1 = new Student();
//        s1.age =21;
//        s1.name= "Aman";
//
//        s1.display();
//    }
//}

//Explanation
//age and name belong to object s1
//Every new object will have its own copy


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                                          3. Static (Class) Variables
//
//A static variable is declared using the static keyword and belongs to the class rather than objects.
//Characteristics
//Declared with static
//Only one copy shared by all objects
//Stored in method area
//Accessed using ClassName.variable

//public class Variables {
//    static String company = "Google";
//    String name;
//
//    public static void main(String[] args) {
//        Variables e1 = new Variables();
//        Variables e2 = new Variables();
//
//        e1.name = "Aman";
//        e2.name = "Rishabh";
//
//        System.out.println(e1.name + " " + Variables.company);
//        System.out.println(e2.name + " " + Variables.company);
//    }
//}

//Explanation
//company is shared by all objects
//Both e1 and e2 use the same variable
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                                               4. Parameter Variables
//
//Parameter variables are variables declared in the method parameter list.
//Characteristics
//Used to receive values when method is called
//Scope limited to the method

public class Variables {

    void sum(int a, int b) {   // parameter variables
        int result = a + b;    // local variable
        System.out.println(result);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.sum(5, 10);
    }
}

//Explanation
//a and b are parameters
//They exist only inside the sum() method



