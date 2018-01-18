package freelifer.ground.kits;

/**
 * @author kzhu on 2018/1/18.
 */
public class Empties {

    public static boolean Inspect(CharSequence str) {
        return str == null || str.length() <= 0;
    }

    public static boolean Inspect(Object[] objects) {
        return objects == null || objects.length <= 0;
    }
}
