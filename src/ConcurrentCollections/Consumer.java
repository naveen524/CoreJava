package ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
	protected ArrayBlockingQueue queue = null;

    public Consumer(ArrayBlockingQueue queue2) {
        this.queue = queue2;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
