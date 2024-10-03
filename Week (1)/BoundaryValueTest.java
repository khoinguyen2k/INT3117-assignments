import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BoundaryValueTest {
    @Test
    public void testcase1_BV() {
        assertEquals(0, caculatorElectric.caculatorElectric(0));
    }
    @Test
    public void testcase2_BV() {
        assertEquals(2000, caculatorElectric.caculatorElectric(1));
    }
    @Test
    public void testcase3_BV() {
        assertEquals(6110000, caculatorElectric.caculatorElectric(5000));
    }
    @Test
    public void testcase4_BV() {
        assertEquals(12107600, caculatorElectric.caculatorElectric(9998));
    }
    @Test
    public void testcase5_BV() {
        assertEquals(12108800, caculatorElectric.caculatorElectric(9999));
    }
}
