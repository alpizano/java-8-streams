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


    }
}
