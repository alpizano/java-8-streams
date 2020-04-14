package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /**
         * Prior to Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //  0 -> o1 == o2
                                         //  1 -> o1 > o2
                                         // -1 -> o1 < o2
                
            }
        };

        System.out.println("Result of the Comparator is: " + comparator.compare(3,2));

    }
}
