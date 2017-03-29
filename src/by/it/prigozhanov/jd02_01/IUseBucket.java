package by.it.prigozhanov.jd02_01;

import java.util.List;
import java.util.Map;

/**
 * Created by v-omf on 3/29/2017.
 *
 * @author v-omf
 */
public interface IUseBucket {
    Map<String, Double> takeBucket();
    void putGoodsToBucket(Map<String, Double> bucketGoods, Good good);
    void putBucket();
}
