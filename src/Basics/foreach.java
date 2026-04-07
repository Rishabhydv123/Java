package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class foreach {

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(25, 23, 15, 8));
//        List<Integer>list=Arrays.asList(25, 10,30,6,12,20 );
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);


////    list.stream().forEach(System.out::println);
//
//        list.stream().filter(n->2%==0).forEach(System.out::println);
//        list.stream().filter(null)

//        List<Integer> result = list.stream()
//                .filter(n -> n > 10)
//                .sorted()
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

//        int result = list.stream()
//        	    .reduce(0, (a, b) -> a + b);
//        System.out.print(result);


//    	peek method
        list.stream().peek(n->System.out.println("Before :" +n))
                .map(n->n*2).peek(n->System.out.println("After   :" +n))
                .collect(Collectors.toList());


        long count = list.stream().count();
        System.err.println("count :" +count);

        int sum=list.stream().mapToInt(n->n).sum();
        System.out.println("Sum :" +sum);


//    Find method (first element)
        Optional<Integer> first=list.stream().findFirst();
        System.out.println("First Element :" +first.get());

//    	findany
        Optional<Integer>findany=list.stream().findAny();
        System.out.println("findAny Element :" +findany);

//    	Anymatch
        boolean iseven=list.stream().anyMatch(n->n%2==0);
        System.out.println(iseven);

//    	all Match
        boolean isodd=list.stream().allMatch(n->n%2==1);
        System.out.print(isodd);



    }

}
