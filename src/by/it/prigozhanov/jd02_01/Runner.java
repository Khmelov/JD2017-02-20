package by.it.prigozhanov.jd02_01;

/**
 * Created by v-omf on 3/29/2017.
 *
 * @author v-omf
 */
public class Runner {
    public static int countBuyers = 0;
    public static int plan = 1000;
    public static int buckets = 500;
    public static int currentBuyersCounter=0;

    public static void main(String[] args) {
        Buyer buyer;
        SecondsCounter seconds = new SecondsCounter();
        seconds.start();
        while (countBuyers < plan) {
            int count = Helper.getRandom(2);
            while (count > 0 && currentBuyersCounter<seconds.second+10 && seconds.second<=30) {
                System.out.println(seconds);
                buyer = new Buyer(++countBuyers, Helper.getRandomBuyer());
                buyer.start();
                count--;
                if (countBuyers == plan) break;
            }
            while (count > 0 && currentBuyersCounter<=40+(30-seconds.second) && seconds.second>30) {
                System.out.println(seconds);
                buyer = new Buyer(++countBuyers, Helper.getRandomBuyer());
                buyer.start();
                count--;
                if (countBuyers == plan) break;
            }
            Helper.sleep(200);
        }
        System.out.println("Все вошли");
    }
}