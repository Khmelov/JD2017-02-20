package by.it.prigozhanov.jd02_02;

import by.it.akhmelev.jd02_02.classwork.QueueBuyers;

import java.util.List;

/**
 * Created by v-omf on 3/31/2017.
 *
 * @author v-omf
 */
public class Cashier extends Thread {
    private String name;

    public Cashier(int num) {
        this.name = "[ Кассир №:" + num + " ] ";
        System.out.println(this + "открыл кассу");
    }

    @Override
    public void run() {
        Buyer buyer;
        double check = 0;
        while ((buyer = BuyersQueue.extract()) != null) {
            System.out.println(this + "начал обслуживание покупателя " + buyer);
            List<Good> buyersBusket = buyer.basket.getBascket();
            Helper.sleep(buyer.basket.getBascket().size() * 1000);
            System.out.println(this + "обрабатывает корзинку покупателя: " + buyersBusket);// сделал зависимость времени ожидания от колличества товаров
            for (Good good : buyersBusket) {
                check += good.getPrice();
            }
            System.out.println(buyer + "получил чек на " + check + "$");
            getCheckToDispatcher(check);
            synchronized (buyer) {
                buyer.notify();
            }
            System.out.println(this + "завершил обслуживание покупателя " + buyer);
        }
        System.out.println(this + "закрыл кассу");
        Dispatcher.cashiers.remove(this);
        System.out.println("Осталось кассиров: " + Dispatcher.cashiers.size());
    }

    protected void getCheckToDispatcher(double check) {
        Dispatcher.earnings+= check;
    }

    @Override
    public String toString() {
        return name;
    }
}
