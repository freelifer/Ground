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
        assertEquals("String isEmpty()-null ", Empties.inspect(src), true);
        src = "";
        assertEquals("String isEmpty()-empty ", Empties.inspect(src), true);
        src = "abc";
        assertEquals("String isEmpty()-notempty ", Empties.inspect(src), false);
    }

    @Test
    public void inspectObjectArray() throws Exception {
        Object[] src = null;
        assertEquals("ObjectArray isEmpty()-null ", Empties.inspect(src), true);
        src = new Object[0];
        assertEquals("ObjectArray isEmpty()-empty ", Empties.inspect(src), true);
        src = new Object[1];
        assertEquals("ObjectArray isEmpty()-notempty ", Empties.inspect(src), false);

    }

}