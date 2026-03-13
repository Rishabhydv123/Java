//public class Exception_Handling {
//}

//exception handling using try catch block
//class TestException {
//
//    public static void main(String[] args){
//
//        try{
//
//            int a = 10;
//            int b = 0;
//
//            int c = a / b;
//
//            System.out.println(c);
//
//        }catch(ArithmeticException e){
//
//            System.out.println("Cannot divide by zero");
//        }
//
//        System.out.println("Program continues...");
//    }
//}

//class TestNull {
//    public static void main(String[] args){
//        String str = null;
//        System.out.println(str.length());
//    }
//}

//class TestArray {
//
//    public static void main(String[] args){
//        int[] arr = {10,20,30};
//        System.out.println(arr[5]);
//    }
//}

//class TestCast {
//    public static void main(String[] args){
//        Object obj = new Integer(10);
//        String str = (String) obj;
//        System.out.println(str);
//    }
//}

class BankApp {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[2] = 10;   // valid index (0,1,2)
            int result = 10 / 2;   // avoid division by zero
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
        catch (ArithmeticException e) {
            System.out.println("Division error");
        }
        catch (Exception e) {
            System.out.println("General exception");
        }
        System.out.println("Application running...");
    }
}