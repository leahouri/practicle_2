package ex3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingMain {

        public static void main(String[] args) {

            BlockingQueue<String> queue = new LinkedBlockingQueue<>();
            AddingThread addingThread = new AddingThread(queue);
            TakingThread takingThread = new TakingThread(queue);   //create the object of class BlockingQueue

            addingThread.start();
            takingThread.start(); //create threads AddingThread and TakingThread
        }
    }


