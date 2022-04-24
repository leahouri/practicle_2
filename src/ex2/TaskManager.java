package ex2;

public class TaskManager {

    public void performTask(String CurrentThreadName, int CurrentValueID){
        System.out.println(CurrentThreadName + CurrentValueID);  //output to the screen current thread name and the current value of taskId


        try {

            Thread.sleep(4);   //sleep the thread for 4 milliseconds
        } catch (InterruptedException e) {

            e.printStackTrace();
            System.out.println(CurrentThreadName + CurrentValueID);  //again print the current thread name and the current value of taskId
        }

    }
}




