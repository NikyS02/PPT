import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpoctiYKvRTest {
    SpoctiYKvR spoctiYKvR = new SpoctiYKvR();
    KvR kvR = new KvR(2,5,1);

    @Test
    void calc() {
        assertEquals(76, spoctiYKvR.calc(kvR, 5));
    }

    @Test
    void calcY() {
        double x[] = {5,1,2,3};
        double vys[] = {76,8,19,34};
        assertArrayEquals(vys, spoctiYKvR.calcY(kvR, x));
    }
}