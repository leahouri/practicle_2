package ex4;

public class Producer {
    Goods goods; //should receive a parameter of type Goods

    @Override //rewrite method run

    public void run(){

        for (int i = 1; i<10; i++){ //continuously create new goods

            try {

                goods.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Produced"+goods.amount);  //output the amount

        }
    }

}
