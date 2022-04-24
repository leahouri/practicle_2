package ex3;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread {
    BlockingQueue blockingQueue;

    public TakingThread(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000); //call sleep for 1 second

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(blockingQueue); //output information to the screen
    }

}


