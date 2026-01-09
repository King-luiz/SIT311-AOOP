// =====================================================
// Practice Exercise 2
// Demonstrating synchronization in Java
// =====================================================

class Counter {
    int count = 0;

    // Synchronized method ensures only one thread accesses it at a time
    synchronized void increment() {
        count++;
    }
}

class CounterThread extends Thread {
    Counter c;

    CounterThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

public class ThreadPractice2 {
    public static void main(String[] args) {

        Counter c = new Counter();

        CounterThread t1 = new CounterThread(c);
        CounterThread t2 = new CounterThread(c);

        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }

        // Final count should be 2000 if synchronization worked
        System.out.println("Final Count: " + c.count);
    }
}
