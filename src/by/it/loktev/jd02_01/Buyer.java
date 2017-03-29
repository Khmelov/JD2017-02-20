package by.it.loktev.jd02_01;

public class Buyer extends Thread implements IBuyer, IUseBacket {

    private int num;

    public Buyer(int num) {
        super("Покупатель №"+num);
        this.num = num;
    }

    @Override
    public void enterToMarket() {
        System.out.println(this+" зашёл в магазин");
    }

    @Override
    public void goToOut() {
        System.out.println(this+" вышел из магазина");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this+" вошёл в зал");
        Helper.sleep(Helper.getRandom(500,1000));
        System.out.println(this+" выбрал товары");
    }

    @Override
    public void takeBacket() {
    }

    @Override
    public void backBacket() {

    }

    @Override
    public void putGoodsToBacket() {
    }

    @Override
    public void run() {

        enterToMarket();

        chooseGoods();

        goToOut();

    }

    @Override
    public String toString() {
        return "Покупатель №"+num;
    }
}
