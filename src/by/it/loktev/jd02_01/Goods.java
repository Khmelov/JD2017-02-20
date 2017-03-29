package by.it.loktev.jd02_01;

import java.util.HashMap;
import java.util.Map;

public class Goods {

    private Map<String,Double> list=new HashMap<String,Double>(){
        {
            this.put("молоко",1.0);
            this.put("хлеб",0.5);
            this.put("кофе",3.0);
            this.put("чай",2.0);
            this.put("кока-кола",1.5);
        }
    };

}
