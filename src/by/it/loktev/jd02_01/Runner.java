package by.it.loktev.jd02_01;

public class Runner {

    public static int countBuyers=0;
    public static int plan=10;

    public static void main(String[] args)  {

        while (countBuyers<plan)
        {
            Buyer b=new Buyer(++countBuyers);
            b.start();
            Helper.sleep(Helper.getRandom(300,1000));
        }


        //System.out.println("Завершено");

    }

}
