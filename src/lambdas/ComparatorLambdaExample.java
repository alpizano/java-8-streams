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

        // Lambda can be replaced with method reference
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of the Comparator using Lambda: " + comparatorLambda.compare(3,2));

        // Lambda can be replaced with method reference. Do not need to mention Integer type since Integer type is already provided
        // Lambda knows to typecast input to Integer
        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

        System.out.println("Result of the Comparator using Lambda: " + comparatorLambda1.compare(3,2));
    }
}
