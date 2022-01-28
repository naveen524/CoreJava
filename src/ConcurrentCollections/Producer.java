package ConcurrentCollections;
import java.util.concurrent.ArrayBlockingQueue;
public class Producer implements Runnable{
	protected ArrayBlockingQueue queue = null;
    public Producer(ArrayBlockingQueue queue2) {
        this.queue = queue2;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
