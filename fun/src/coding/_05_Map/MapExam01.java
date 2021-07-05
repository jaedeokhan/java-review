package coding._05_Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class MapExam01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");

        map.put("001", "kang"); // 중복되는 키여서 덮어써진다.

        System.out.println(map.size());
        System.out.println(map.get("001")); // kim => kang이 나온다.

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        while (iter.hasNext()){
            String str = iter.next();
            System.out.println("key : " + str + " value : " + map.get(str));
        }

    }
}
