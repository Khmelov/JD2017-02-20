package by.it.prigozhanov.jd02_01;

/**
 * Created by v-omf on 3/29/2017.
 *
 * @author v-omf
 */
public class Timer extends Thread {
    protected int second=0;
    protected int minute=0;
    private int set;

    /**
     * set - введённое количество минут в конструкторе
     * @param minutes - задаёт колличество минут для таймера.
     */
    public Timer(int minutes) {
        this.set = minutes;
    }


    @Override
    public void run() {
        while (minute < set) {
            for (int i = 0; i < 60; i++) {
                System.out.println(minute + " минут " + second + " секунд");
                Helper.sleep(1000);
                second++;
            }
            minute++;
            second=0;
        }
    }

    @Override
    public String toString() {
        return "second=" + second;
    }
}
