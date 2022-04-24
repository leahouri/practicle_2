package ex4;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        Consumer consumer= new Consumer();
        Producer producer = new Producer();  //create objects of new classes

        producer.start ();
          //run the threads Consumer and Producer.
    }
}

