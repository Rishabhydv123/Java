
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class women {
    int age;
    String name;

    // constructor
    public women(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

// age comparator
class agecomparator implements Comparator<women> {
    public int compare(@org.jetbrains.annotations.NotNull women w1, women w2) {
        return w1.age - w2.age;
    }
}

// name comparator
class namecomparator implements Comparator<women> {
    @Override
    public int compare(women w1, women w2) {
        // Use built-in compareTo for Strings
        return w1.name.compareTo(w2.name);
    }
}

public class Multiple_sorting {

    public static void main(String[] args) {

        ArrayList<women> list = new ArrayList<>();

        list.add(new women(22, "chandni"));
        list.add(new women(10, "babita"));
        list.add(new women(15, "priya"));
        list.add(new women(15, "anita"));
        list.add(new women(40, "anjali"));

        // age comparator
        Collections.sort(list, new agecomparator());
        System.out.println("age comparator:");
        for (women w : list) {
            System.out.println(w.age + " " + w.name);
        }

        // name comparator
        Collections.sort(list, new namecomparator());
        System.out.println("name comparator:");
        for (women w : list) {
            System.err.println(w.age + " " + w.name);
        }
    }
}
