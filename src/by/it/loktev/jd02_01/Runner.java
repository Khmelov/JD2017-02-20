package by.it.loktev.jd02_01;

public class Runner {

    public static int countBuyers=0;
    public static int plan=10;

    public static void main(String[] args) throws InterruptedException {

        while (countBuyers<plan)
        {
            Buyer b=new Buyer(++countBuyers);
            b.start();
            Thread.sleep((int)(Math.random()*700+300));
        }

        //System.out.println("Завершено");

    }

}
