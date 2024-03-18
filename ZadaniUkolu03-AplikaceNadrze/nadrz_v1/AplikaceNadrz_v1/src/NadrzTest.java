import static org.junit.jupiter.api.Assertions.*;

class NadrzTest {
    Nadrz nadrz = new Nadrz(50.0);
    @org.junit.jupiter.api.Test
    void get_kapacita() {
        assertEquals(50.0, nadrz.get_kapacita());
    }

    @org.junit.jupiter.api.Test
    void addCorrect() {
        assertTrue(nadrz.add(25.0));
    }

    @org.junit.jupiter.api.Test
    void addWrong() {
        assertFalse(nadrz.add(100.0));
        assertFalse(nadrz.add(-1.0));
    }

    @org.junit.jupiter.api.Test
    void removeCorrect() {
        nadrz.add(25.0);
        assertTrue(nadrz.remove(20.0));
    }

    @org.junit.jupiter.api.Test
    void removeWrong() {
        assertFalse(nadrz.remove(-200.0));
    }
}