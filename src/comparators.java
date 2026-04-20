import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class customers{
    int age;
    String name;
    //	constructor
    customers(int age,String name) {
        // TODO Auto-generated constructor stub
        this.name=name;
        this.age=age;
    }

    public static customers createcustomers(int age, String durgesh) {
        return new customers(age, durgesh);
    }
}
// comparator 1
class ageComparator implements Comparator<customers>{
    public int compare(customers a1,customers a2) {
        return a1.age-a2.age;

    }


}
// comparator 2 by name
class nameComparator implements Comparator<customers> {
    public int compare(customers a1,customers a2) {
        return a1.name.compareTo(a2.name);
    }
}
// sort name and age together
class AgeThenNameComparator implements Comparator<customers>{
    public int  compare(customers c1,customers c2) {
        if(c1.age!=c2.age) {
            return c1.age-c2.age;

        }
        else {
            return c1.name.compareTo(c2.name);
        }

    }
}

public class comparators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<customers> list = new ArrayList<>();

//        list.add(new customers(25, "shahzad"));
//        list.add(new customers(18, "Durgesh"));
//        list.add(new customers(35, "Ishan"));
//        list.add(new customers(23, "swapnil"));
//        list.add(new customers(25, "abad"));

//        list.add(new customers(25, "acid"));

        list.add(new customers(40, "a"));

//        list.add(new customers(25, "Aman")); // same age for testing
//        sort by age
        Collections.sort(list,new ageComparator());
        System.out.println("sorting by age:");

        for(customers a:list) {
            System.err.println(a.age +" "+a.name);
        }
//        sort by age then name

        Collections.sort(list,new AgeThenNameComparator());
        System.out.println("age then name comparator");
        for(customers a:list) {
            System.out.println(a.age+ " "+a.name);
        }


    }

}