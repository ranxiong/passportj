package jinx.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/1/22.
 */
public class MapOrder {

    public static void main(String[] args) {
        System.out.println("default order:" + new MapOrder().order());
        System.out.println("sorted key order:" + new MapOrder().orderKey());

        for (Map.Entry<String, String> entry: new MapOrder().orderKey().entrySet()
             ) {
            System.out.println(entry.getKey()+entry.getValue());
        }

    }

    public Map<String, String> order() {

        return new HashMap<String, String>() {
            {
                put("zz_id", "zz_test");
                put("app_id", "app_id_test");
                put("app_key", "app_key_test");
                put("zd", "zd_test");
            }
        };
    }

    public Map<String, String> orderKey() {
        Map<String, String> treeMap = new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                // 升序
                return o1.compareTo(o2);
                // 降序
                //return o2.compareTo(o1);
            }
        });
        treeMap.putAll(order());
        return treeMap;

    }

}
