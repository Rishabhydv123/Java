public class LambdaRunnableExample {
    public static void main(String[] args) {

        // Using lambda expression to implement Runnable
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread running: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}