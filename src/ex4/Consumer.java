package ex4;

public class Consumer extends Thread {

    Goods goods;  //should receive a parameter of type Goods

    @Override  //rewrite method run

    public void run(){

        for (int i= 1 ;i<10;i++){  //the goods should be consumed continuously
            goods.consume();

            System.out.println("Product"+goods.amount); // The consumed amount of goods is printed
        }
    }
}

