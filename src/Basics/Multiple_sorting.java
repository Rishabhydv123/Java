//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Woman {
//    int age;
//    String name;
//
//    // constructor
//    public Woman(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//}
//
//// age comparator
//class AgeComparator implements Comparator<Woman> {
//    public int compare(@NotNull Woman w1, Woman w2) {
//        return Integer.compare(w1.age, w2.age);
//    }
//}
//
//// name comparator
//class NameComparator implements Comparator<Woman> {
//    private Woman w1;
//    private Woman w2;
//
//    @Override
//    public int
//    compare(@NotNull Woman w1, Woman w2) {
//        this.w1 = w1;
//        this.w2 = w2;
//        return w1.name.compareTo(w2.name);
//    }
//}
//
//public class MultipleSorting {
//    public static void main(String[] args) {
//
//        ArrayList<Woman> list = new ArrayList<>();
//
//        list.add(new Woman(22, "chandni"));
//        list.add(new Woman(10, "babita"));
//        list.add(new Woman(15, "priya"));
//        list.add(new Woman(15, "anita"));
//        list.add(new Woman(40, "anjali"));
//
//        // age comparator
//        Collections.sort(list, new AgeComparator());
//        System.out.println("Age comparator:");
//        for (Woman w : list) {
//            System.out.println(w.age + " " + w.name);
//        }
//
//        // name comparator
//        Collections.sort(list, new NameComparator());
//        System.out.println("\nName comparator:");
//        for (Woman w : list) {
//            System.out.println(w.age + " " + w.name);
//        }
////    }
//}