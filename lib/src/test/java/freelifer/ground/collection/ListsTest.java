package freelifer.ground.collection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author kzhu on 2018/1/5.
 */
public class ListsTest {
    @Test
    public void New() throws Exception {
        List list = Lists.New();
        assertEquals("Lists.New() ", list != null, true);
    }

    @Test
    public void isEmpty() throws Exception {
        List list = null;
        assertEquals("Lists.IsEmpty()-null ", Lists.IsEmpty(list), true);

        list = Lists.New();
        assertEquals("Lists.IsEmpty()-empty ", Lists.IsEmpty(list), true);

        list.add(new Object());
        assertEquals("Lists.IsEmpty()-notempty ", Lists.IsEmpty(list), false);

    }

    @Test
    public void size() throws Exception {
        List list = null;
        assertEquals("Lists.Size()-null ", Lists.Size(list) == 0, true);

        list = Lists.New();
        assertEquals("Lists.Size()-empty ", Lists.Size(list) == 0, true);

        list.add(new Object());
        assertEquals("Lists.Size()-add one ", Lists.Size(list) == 1, true);
    }

    @Test
    public void each() throws Exception {
        List list = null;
        Lists.Each(list, (list1, o) -> false);

        list = Lists.New();
        Lists.Each(list, (list1, o) -> {
            System.out.println(o);
            return false;
        });

        list.add(new Object());
        Lists.Each(list, (list1, o) -> {
            System.out.println(o);
            return false;
        });

    }
}