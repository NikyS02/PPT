import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VyhodnoceniProspechuTest {

    @Test
    void testProspechVyborne() {
        int[] znamky = {1,1,2,1};
        assertEquals("výborně", VyhodnoceniProspechu.prospech(znamky));
    }

    void testProspechChvalitebne() {
        int[] znamky = {2,2,2,2,3,2,1,2};
        assertEquals("chvalitebně", VyhodnoceniProspechu.prospech(znamky));

        int[] znamky2 = {1,2};
        assertEquals("chvalitebně", VyhodnoceniProspechu.prospech(znamky2));
    }

    void testProspechDobre() {
        int[] znamky = {3,3,3,3,3,3,3,3,3,3,3,2,1,3};
        assertEquals("dobře", VyhodnoceniProspechu.prospech(znamky));

        int[] znamky2 = {2,3};
        assertEquals("dobře", VyhodnoceniProspechu.prospech(znamky2));
    }

    void testProspechDostatecne() {
        int[] znamky = {4,3,4,4};
        assertEquals("dostatečně", VyhodnoceniProspechu.prospech(znamky));

        int[] znamky2 = {3,4};
        assertEquals("dostatečně", VyhodnoceniProspechu.prospech(znamky2));
    }

    void testProspechNedostatecne() {
        int[] znamky = {5,5,5,5};
        assertEquals("nedostatečně", VyhodnoceniProspechu.prospech(znamky));

        int[] znamky2 = {4,5};
        assertEquals("nedostatečně", VyhodnoceniProspechu.prospech(znamky2));
    }
}