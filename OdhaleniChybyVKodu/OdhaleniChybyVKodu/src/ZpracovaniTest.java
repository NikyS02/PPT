import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZpracovaniTest {

    @Test
    void testIntervalTrue() {
        assertTrue(Zpracovani.interval(10, 20, 15));
    }
    @Test
    void testIntervalFalse() {
        assertFalse(Zpracovani.interval(10, 20, 9));
        assertFalse(Zpracovani.interval(-10, 20, -10));
        assertFalse(Zpracovani.interval(10, 20, 20));
    }

    @Test
    void testVzorkySestupneTrue() {
        double[] vzorek = {3.0, 2.5, 2.0, 1.5, 1.0};
        assertArrayEquals(vzorek, Zpracovani.vzorkySestupně(1.0,3.0,0.5));
    }

    @Test
    void testVzorkySestupneFalse() {
        double[] vzorek = {3.5, 2.5, 2.0, 1.5, -1.0};
        assertFalse(Arrays.equals(vzorek, Zpracovani.vzorkySestupně(1.0,3.0,0.5)));
    }
}