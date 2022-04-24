package ex3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {

    BlockingQueue blockingQueue;
    public AddingThread(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    public void run() {
        for(int i = 0; i < 3; i++){   //in cycle with 3 iterations, add the element to the queue with iteration number
            blockingQueue.add("Element" + i);
            System.out.println("le" + i + "a été ajoutée à la queue");  //output this element and information that element has been added
        }
    }
}
