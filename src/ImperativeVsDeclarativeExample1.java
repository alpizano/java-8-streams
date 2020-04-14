public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of programming
         */

        int sum = 0;
        for(int i=0; i<=100; i++) {
            sum+=i;
        }

        System.out.println("Sum using Imperative Approach: " + sum);
    }

}
