package ex1;

public class PriorityThread extends Thread {
    String name;
    public PriorityThread(String name) {
        this.name = name;    //be inherited from Thread and should have a constructor, which should give a name to the created thread
    }
    @Override  //rewrite method run

    public void run() {


        for (int i = 0; i <= 100; i++) {   //define the cycle with 100 iterations.
            System.out.println(i + " " + name);  //output the name of the thread and current iteration

            try {

                Thread.sleep (1000);   //make the thread sleep to 10 milliseconds using Thread.sleep
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
