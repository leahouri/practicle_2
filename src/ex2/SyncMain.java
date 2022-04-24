package ex2;

public class SyncMain {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        TaskThread thread1 = new TaskThread ("First", 1, taskManager);
        TaskThread thread2 = new TaskThread ("Second", 2, taskManager);//create two or more threads with different names and taskId

        thread1.start();
        thread2.start();//run threads
    }
}

