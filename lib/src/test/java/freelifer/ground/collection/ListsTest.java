package freelifer.ground.collection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author kzhu on 2018/1/5.
 */
public class ListsTest {
    @Test
    public void New() throws Exception {
        List list = Lists.New();
        assertTrue(list != null);
    }

    @Test
    public void isEmpty() throws Exception {
        List list = null;
        assertTrue(Lists.IsEmpty(list));

        list = Lists.New();
        assertTrue(Lists.IsEmpty(list));

        list.add(new Object());
        assertFalse(Lists.IsEmpty(list));

    }

    @Test
    public void size() throws Exception {
        List list = null;
        assertTrue(Lists.Size(list) == 0);

        list = Lists.New();
        assertTrue(Lists.Size(list) == 0);

        list.add(new Object());
        assertTrue(Lists.Size(list) == 1);
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