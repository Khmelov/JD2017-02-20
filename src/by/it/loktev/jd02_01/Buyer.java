package by.it.loktev.jd02_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Buyer extends Thread implements IBuyer, IUseBacket {

    private int num;

    private Map<Good,Double> backet;

    public Buyer(int num) {
        super("Покупатель №"+num);
        this.num = num;
        backet=new HashMap<>();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this+" зашёл в магазин");
        Helper.sleep(Helper.getRandom(400,700));
    }

    @Override
    public void goToOut() {
        Helper.sleep(Helper.getRandom(400,700));
        System.out.println(this+" вышел из магазина");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this+" вошёл в зал");
        int goodsCount=Helper.getRandom(1,4);
        for (int g=1; g<=goodsCount; g++){
            Helper.sleep(Helper.getRandom(400,700));
            Good good=Goods.getRandomGood();
            double quantity=Helper.getRandom(1,3);
            putGoodToBacket(good,quantity);
            System.out.println(this+" выбрал товар "+good.getName()+" ценой "+good.getPrice()+" "+quantity+" штук");
        }
        Helper.sleep(Helper.getRandom(400,700));
        System.out.println(this+" пошёл на кассу");
    }

    @Override
    public void takeBacket() {
        Helper.sleep(Helper.getRandom(100,200));
        System.out.println(this+" взял корзину");
    }

    @Override
    public void backBacket() {
        Helper.sleep(Helper.getRandom(100,200));
        System.out.println(this+" вернул корзину");
    }

    @Override
    public void putGoodToBacket(Good good, double quantity) {
        if ( backet.containsKey(good) ){
            quantity+=backet.get(good);
        }
        backet.put(good,quantity);
    }

    @Override
    public void run() {

        enterToMarket();
        takeBacket();
        chooseGoods();
        backBacket();
        goToOut();

    }

    @Override
    public String toString() {
        return "Покупатель №"+num;
    }
}
