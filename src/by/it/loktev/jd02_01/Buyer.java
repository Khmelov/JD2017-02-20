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
            System.out.println(this+" выбрал товар "+good.getName()+" ценой "+good.getPrice());
        }
        Helper.sleep(Helper.getRandom(400,700));
        System.out.println(this+" пошёл на кассу");
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
