package freelifer.ground.collection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
        assertEquals("Lists.isEmpty()-null ", Lists.isEmpty(list), true);

        list = Lists.New();
        assertEquals("Lists.isEmpty()-empty ", Lists.isEmpty(list), true);

        list.add(new Object());
        assertEquals("Lists.isEmpty()-notempty ", Lists.isEmpty(list), false);

    }

    @Test
    public void size() throws Exception {
        List list = null;
        assertEquals("Lists.size()-null ", Lists.size(list) == 0, true);

        list = Lists.New();
        assertEquals("Lists.size()-empty ", Lists.size(list) == 0, true);

        list.add(new Object());
        assertEquals("Lists.size()-add one ", Lists.size(list) == 1, true);
    }

    @Test
    public void each() throws Exception {
        List list = null;
        Lists.each(list, (list1, o) -> false);

        list = Lists.New();
        Lists.each(list, (list1, o) -> {
            System.out.println(o);
            return false;
        });

        list.add(new Object());
        Lists.each(list, (list1, o) -> {
            System.out.println(o);
            return false;
        });

    }
}