import java.util.*;

class Helper extends TimerTask {
    public static int i = 0;

    public void run() {
        System.out.println("Timer ran " + ++i);
    }
}

public class q1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new Helper();

        timer.schedule(task, 3000, 8000);
    }
}