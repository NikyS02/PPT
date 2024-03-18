import static org.junit.jupiter.api.Assertions.*;

class NadrzTest {
    Nadrz nadrz = new Nadrz(50.0);
    @org.junit.jupiter.api.Test
    void get_kapacita() {
        assertEquals(50.0, nadrz.get_kapacita());
    }

    @org.junit.jupiter.api.Test
    void addCorrect() throws PlnaNadrzException {
        assertTrue(nadrz.add(25.0));
    }

    @org.junit.jupiter.api.Test
    void addWrong() throws PlnaNadrzException {
        assertThrows(PlnaNadrzException.class, () -> {
            nadrz.add(100.0);
        });
        assertFalse(nadrz.add(-1.0));
    }

    @org.junit.jupiter.api.Test
    void removeCorrect() throws PlnaNadrzException, PrazdnaNadrzException {
        nadrz.add(25.0);
        assertTrue(nadrz.remove(20.0));
    }

    @org.junit.jupiter.api.Test
    void removeWrong() throws PlnaNadrzException, PrazdnaNadrzException {
        nadrz.add(25.0);
        assertThrows(PrazdnaNadrzException.class, () -> {
            nadrz.remove(200.0);
        });
        assertFalse(nadrz.remove(-10.0));
    }
}