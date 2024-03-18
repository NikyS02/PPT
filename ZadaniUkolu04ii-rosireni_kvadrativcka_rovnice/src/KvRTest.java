import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KvRTest {
    KvR kvr = new KvR(4,5,9);

    @Test
    void getA() {
        assertEquals(4, kvr.getA());
    }

    @Test
    void getB() {
        assertEquals(5, kvr.getB());
    }

    @Test
    void getC() {
        assertEquals(9, kvr.getC());
    }
}