package by.it.prigozhanov.jd02_02;

import java.util.ArrayDeque;

/**
 * Created by v-omf on 3/31/2017.
 *
 * @author v-omf
 */
public class BuyersQueue {
    private final static ArrayDeque<Buyer> queueBuyers = new ArrayDeque<>();

    static void add(Buyer buyer) {
        synchronized (queueBuyers) {
            queueBuyers.addLast(buyer);
        }
    }

    static Buyer extract() {
        synchronized (queueBuyers) {
          return queueBuyers.removeFirst();
        }
    }

    static int getSize () {
        return queueBuyers.size();
    }

}
