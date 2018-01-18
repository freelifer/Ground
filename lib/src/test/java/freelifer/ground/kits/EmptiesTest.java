package freelifer.ground.kits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kzhu on 2018/1/18.
 */
public class EmptiesTest {
    @Test
    public void inspectCharSequence() throws Exception {
        String src = null;
        assertEquals("String IsEmpty()-null ", Empties.Inspect(src), true);
        src = "";
        assertEquals("String IsEmpty()-empty ", Empties.Inspect(src), true);
        src = "abc";
        assertEquals("String IsEmpty()-notempty ", Empties.Inspect(src), false);
    }

    @Test
    public void inspectObjectArray() throws Exception {
        Object[] src = null;
        assertEquals("ObjectArray IsEmpty()-null ", Empties.Inspect(src), true);
        src = new Object[0];
        assertEquals("ObjectArray IsEmpty()-empty ", Empties.Inspect(src), true);
        src = new Object[1];
        assertEquals("ObjectArray IsEmpty()-notempty ", Empties.Inspect(src), false);

    }

}