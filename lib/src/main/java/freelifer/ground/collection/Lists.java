package freelifer.ground.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhukun on 2018/1/4.
 */

public class Lists {

    public static <E> List<E> New() {
        return new ArrayList<>();
    }

    public static boolean IsEmpty(List list) {
        return list == null || list.size() <= 0;
    }

    public static int Size(List list) {
        return list == null ? 0 : list.size();
    }

    public static <E> void Each(List<E> list, ListReader<E> reader) {
        if (IsEmpty(list) || reader == null) {
            return;
        }
        for (E e: list) {
            if (reader.in(list, e)) {
                return;
            }
        }
    }
}
