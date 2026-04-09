package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingby {



    public static void main(String[] args) {

//    	Grouping By
//    	partitioniing by

        List<Integer> list = Arrays.asList(12, 25, 45, 56, 95,88,96,23,52);

        Map<Integer, List<Integer>> groupmap =
                list.stream()
                        .collect(Collectors.groupingBy(n -> n % 2));

        System.out.println("Grouping By " + groupmap);

//    	partitioniing by
        Map<Boolean,List<Integer>>partmap=list.stream().collect(Collectors.partitioningBy(n->n>12));

        System.out.println("Parrirtion By :" +partmap);
    }
}



