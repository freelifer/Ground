package freelifer.ground.collection;

import java.util.List;
import java.util.Map;

/**
 * @author zhukun on 2018/1/4.
 */

public interface MapReader<K, V> {
    boolean in(Map<K, V> list, K k, V v);
}
