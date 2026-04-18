public class LambdaRunnableExample {
    public static void main(String[] args) {

        Runnable r = LambdaRunnableExample::run;

        Thread t1 = new Thread(r);
        t1.start();
    }

    private static void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread run: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // better practice
                System.out.println(e);
            }
        }

    }

}