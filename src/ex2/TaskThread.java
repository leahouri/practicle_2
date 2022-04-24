package ex2;


public class TaskThread extends Thread {

    int CurrentValueID;
    String CurrentThreadName;
    TaskManager TaskManager;

    public TaskThread (int CurrentValueID , String CurrentThreadName , TaskManager TaskManager) {

        this.CurrentValueID = CurrentValueID;   //receive the parameter int taskId
        this.CurrentThreadName = CurrentThreadName; //give a name to the created thread
        this.TaskManager = TaskManager;    //receive the object of TaskManager type
    }
    @Override   //rewrite run method

    public void run() {

        TaskManager taskManager = new TaskManager();
        TaskManager.performTask(CurrentThreadName, CurrentValueID);
    }
}

