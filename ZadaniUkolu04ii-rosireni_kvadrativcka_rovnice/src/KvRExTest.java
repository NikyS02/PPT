import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KvRExTest {

    KvREx kvrex = new KvREx(4,5,9, 8);
    @Test
    void getX() {
        assertEquals(8, kvrex.getX());
    }

    @Test
    void getY() {
        assertEquals(305, kvrex.getY());
    }

    @Test
    void calcY() {
        assertEquals(305, kvrex.calcY());
    }
}