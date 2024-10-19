import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DataFlowTest {
    @Test
    public void testcase1_DF() {
        assertEquals(100000, caculatorElectric.caculatorElectric(50));
    }
    @Test
    public void testcase2_DF() {
        assertEquals(80000, caculatorElectric.caculatorElectric(40));
    }
    @Test
    public void testcase3_DF() {
        assertEquals(275000, caculatorElectric.caculatorElectric(150));
    }
    @Test
    public void testcase4_DF() {
        assertEquals(260000, caculatorElectric.caculatorElectric(140));
    }
    @Test
    public void testcase5_DF() {
        assertEquals(362000, caculatorElectric.caculatorElectric(210));
    }
}
