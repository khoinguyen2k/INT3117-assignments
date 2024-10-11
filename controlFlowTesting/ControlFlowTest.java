import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ControlFlowTest {
    @Test
    public void testcase1_CF() {
        assertEquals(40000, caculatorElectric.caculatorElectric(20));
    }
    @Test
    public void testcase2_CF() {
        assertEquals(260000, caculatorElectric.caculatorElectric(140));
    }
    @Test
    public void testcase3_CF() {
        assertEquals(470000, caculatorElectric.caculatorElectric(300));
    }
}
