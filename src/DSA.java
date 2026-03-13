//public class DSA {
//    public static void main(String[] args) {
//        int[] arr = {20, 5, 10, 40};
//
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Maximum element: " + max);
//    }
//}
//
//


//Pallindrome String




//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        int arr[] = {5,6,7,5,6,2};
//        Set<Integer> set = new LinkedHashSet<>();
//
//        for(int num : arr){
//            set.add(num);
//        }
//
//        System.out.println(set);
//    }
//}


import java.util.Scanner;

public class isPalindrome {
    public static int reverse(int n){
        int ans = 0;

        while (n > 0){
            ans = ans * 10 + (n % 10);
            n = n / 10;
        }

        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if (reverse(n) == n){
            System.out.println(n +" is Palindrome!");
        }
        else{
            System.out.println(n +" is not Palindrome!");

        }

        sc.close();
    }
}
