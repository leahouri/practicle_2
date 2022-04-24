package ex4;

public class Goods {
    int amount ;

    public synchronized void produce(int amount) throws InterruptedException {  //synchronised method void produce
        while(amount>0){
            wait();  //wait is called until there is any amount

        }

        this.amount += amount;
        System.out.println("produce"+amount);
        notify();  //, the field amount is updated and method notify should be called


    }
    public synchronized int consume(){  //a synchronised method int consume
        if (this.amount == 0){   // called until the new goods will arrive
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

        notify();
        this.amount -= 1 ;
        return amount; //the current value of the amount is returned
    }
}

