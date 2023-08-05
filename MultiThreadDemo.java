public class MultiThreadDemo {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();

        // Create and start the third thread
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));
        thread3.start();
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        try {
            // Simulate some work
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " has finished.");
    }
}
