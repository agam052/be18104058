import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Market m = new Market(25);
        m.farmer("apple");
        m.farmer("orange");
        m.farmer("grape");
        m.farmer("watermelon");
        m.consumer();
    }
}

class Market {
    private ArrayList<String> fruits = new ArrayList<>();
    private int num;

    public Market(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

    private synchronized boolean isFull() {
        return fruits.size() == this.num;
    }

    private synchronized boolean isEmpty() {
        return fruits.isEmpty();
    }

    public synchronized void farmer(String ft) {
        if (isFull()) {
            System.out.println("No more fruits can be accepted");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }
        fruits.add(ft);
        System.out.printf("fruit : %s is added %n", ft);
    }

    public synchronized String consumer() {

        if (isEmpty()) {
            System.out.println("No good fruit");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }

        String cur_fruits = fruits.remove(0);
        notifyAll();
        return cur_fruits;
    }
}