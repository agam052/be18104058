import java.util.*;

public class q5 implements Runnable {
    private ArrayBlockingQueue<String> paragraph = new ArrayBlockingQueue<String>(10);
    private CountDownLatch latch;

    public q5(CountDownLatch latch) {
        this.latch = latch;
        String[] s = "This is the paragraph in order".split(" ");
        for (String i : s)
            paragraph.add(i);
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!paragraph.isEmpty())
            System.out.println(paragraph.poll() + " " + Thread.currentThread());

        latch.countDown();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        ExecutorService execute = Executors.newFixedThreadPool(4);
        CountDownLatch latch = new CountDownLatch(4);
        final Ques5 cards = new Ques5(latch);
        for (int i = 0; i < cards.paragraph.size(); i++)
            execute.submit(cards);
        execute.shutdown();
        scan.close();
    }
}