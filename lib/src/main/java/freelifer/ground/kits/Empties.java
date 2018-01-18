package freelifer.ground.kits;

/**
 * @author kzhu on 2018/1/18.
 */
public class Empties {

    public static boolean inspect(CharSequence str) {
        return str == null || str.length() <= 0;
    }

    public static boolean inspect(Object[] objects) {
        return objects == null || objects.length <= 0;
    }
}
