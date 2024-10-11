import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DecisionTable {
    @Test
    public void testcase1_DT() {
        assertEquals(-1, caculatorElectric.caculatorElectric(-1));
    }
    @Test
    public void testcase2_DT() {
        assertEquals(-1, caculatorElectric.caculatorElectric(12345));
    }
    @Test
    public void testcase3_DT() {
        assertEquals(40000, caculatorElectric.caculatorElectric(20));
    }
    @Test
    public void testcase4_DT() {
        assertEquals(290000, caculatorElectric.caculatorElectric(160));
    }
    @Test
    public void testcase5_DT() {
        assertEquals(1550000, caculatorElectric.caculatorElectric(1200));
    }
}
