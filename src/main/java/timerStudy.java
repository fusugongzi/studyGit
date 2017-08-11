import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 15600 on 2017/5/31.
 */
public class timerStudy {
    public static void main(String[] args) {
        ping();
    }

    public static void ping() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                schedule();
            }
        }, 10000, 6000);//ms
    }

    public static void  schedule(){
        System.out.println("wzz");
    }

}
