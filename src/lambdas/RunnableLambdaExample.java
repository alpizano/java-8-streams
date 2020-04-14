package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */

        // Create anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        // Pass runnable to Thread and run method
        new Thread(runnable).start();

        /**
         * Using Java 8 Lambda syntax
         */

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda).start();

        new Thread(runnableLambda1).start();

        new Thread( () -> System.out.println("Lambda inside new Thread")).start();
    }
}
