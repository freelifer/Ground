package freelifer.ground.collection;

import java.util.List;

/**
 * @author zhukun on 2018/1/4.
 */

public interface ListReader<E> {
    boolean in(List<E> list, E e);
}
