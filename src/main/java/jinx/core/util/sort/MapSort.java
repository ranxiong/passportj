package jinx.core.util.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/1/22.
 */
public class MapSort {

    public static Map<String, String> kSort(final Map<String, String> data) {
        Map<String, String> treeMap = new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                // 升序
                return o1.compareTo(o2);
                // 降序
                //return o2.compareTo(o1);
            }
        });
        treeMap.putAll(data);
        return treeMap;
    }
}
