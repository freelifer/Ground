package freelifer.ground.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhukun on 2018/1/4.
 */

public class Maps {
    public static <K, V> Map<K, V> New() {
        return new HashMap<>();
    }

    public static boolean IsEmpty(Map map) {
        return map == null || map.size() <= 0;
    }

    public static int Size(Map map) {
        return map == null ? 0 : map.size();
    }

    public static <K, V> void Each(Map<K, V> map, MapReader<K, V> reader) {
        if (IsEmpty(map) || reader == null) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (reader.in(map, entry.getKey(), entry.getValue())) {
                return;
            }
        }
    }
}
