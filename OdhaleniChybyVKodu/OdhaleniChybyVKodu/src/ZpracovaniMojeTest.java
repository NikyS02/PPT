import static org.junit.jupiter.api.Assertions.*;

class ZpracovaniMojeTest {

    @org.junit.jupiter.api.Test
    void testCompIntVetsi() {
        assertEquals(1, ZpracovaniMoje.comp(5,-5));
        assertEquals(1, ZpracovaniMoje.comp(5,2));
        assertEquals(1, ZpracovaniMoje.comp(-5,-7));
    }

    @org.junit.jupiter.api.Test
    void testCompIntMensi() {
        assertEquals(-1, ZpracovaniMoje.comp(-5,5));
        assertEquals(-1, ZpracovaniMoje.comp(2,5));
        assertEquals(-1, ZpracovaniMoje.comp(-7,5));
    }
    @org.junit.jupiter.api.Test
    void testCompIntRovno() {
        assertEquals(0, ZpracovaniMoje.comp(5,5));
        assertEquals(0, ZpracovaniMoje.comp(0,0));
        assertEquals(0, ZpracovaniMoje.comp(-5,-5));
    }

    @org.junit.jupiter.api.Test
    void testCompStringTrue() {
        assertEquals(1, ZpracovaniMoje.comp("BFLMPSVZ","BFLMPSVZ"));
    }

    @org.junit.jupiter.api.Test
    void testCompStringFalse() {
        assertEquals(-1, ZpracovaniMoje.comp("BFlMPSVZ","BfLMPSVZ"));
    }
}