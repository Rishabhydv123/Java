package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.*;
        import java.lang.*;

class Box<T> {
    T value;

    // Setter Method
    public void setValue(T value) {
        this.value = value;
    }

    // Getter Method
    public T getValue() {
        return value;
    }
}

public class Lamda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		Predicate<Integer>isEVEN = n-> n%2==0;
//		System.out.println(isEVEN.test(12));
//		System.out.println(isEVEN.test(9));
//		System.out.println(isEVEN.test(16));
//		System.out.println(isEVEN.test(19));

//		Predicate<Integer>isMARK = mark->mark>=30;
//		System.out.println(isMARK.test(50));
//		System.out.println(isMARK.test(0));
//		System.out.println(isMARK.test(30));
//		System.out.println(isMARK.test(21));


//		 List<String> names = Arrays.asList("John", "Alice", "Bob");
//	        names.sort((a, b) -> a.compareTo(b));
//	        System.out.println(names);

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("The value of integer generic class is: " + intBox.getValue());

        Box<String> strbox = new Box<>();
        strbox.setValue("Hello");
        System.out.println("The value of integer generic class is: " + strbox.getValue());

        Box<Double> doublebox = new Box<>();
        doublebox.setValue(143.23);
        System.out.println("The value of integer generic class is: " + doublebox.getValue());

    }

}
