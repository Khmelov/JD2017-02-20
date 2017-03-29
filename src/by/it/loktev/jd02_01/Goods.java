package by.it.loktev.jd02_01;

import java.util.*;

public class Goods {

    private static Map<String,Double> list=new HashMap<String,Double>(){
        {
            this.put("молоко",1.0);
            this.put("хлеб",0.5);
            this.put("кофе",3.0);
            this.put("чай",2.0);
            this.put("кока-кола",1.5);
        }
    };

    protected static String getRandomGood(){
      List<String> names=new ArrayList<String>(list.keySet());
      int pos=Helper.getRandom(names.size()-1);
      return names.get(pos);
    };

    protected static double getPrice(String goodName){
        return list.get(goodName);
    }
}
