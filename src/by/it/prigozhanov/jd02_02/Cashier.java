package by.it.prigozhanov.jd02_02;

import by.it.akhmelev.jd02_02.classwork.QueueBuyers;

/**
 * Created by v-omf on 3/31/2017.
 *
 * @author v-omf
 */
public class Cashier extends Thread {
    private String name;

    public Cashier(int num) {
        this.name = "Кассир №:" + num + " открыл кассу";
    }

    @Override
    public void run() {
        Buyer buyer;
        while ((buyer=BuyersQueue.extract()) != null) {
            System.out.println(this + "начал обслуживание покупателя " + buyer);
            synchronized (buyer) {
                buyer.notify();
            }
            System.out.println(this + "завершил обслуживание покупателя " + buyer);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
