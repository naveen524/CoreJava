package ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
public static void main(String[] args) throws InterruptedException {
	ArrayBlockingQueue queue = new ArrayBlockingQueue(1024);

    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    new Thread(producer).start();
    new Thread(consumer).start();

    Thread.sleep(4000);
}

public void put(String string) {
	// TODO Auto-generated method stub
	
}

public char[] take() {
	// TODO Auto-generated method stub
	return null;
}
}

