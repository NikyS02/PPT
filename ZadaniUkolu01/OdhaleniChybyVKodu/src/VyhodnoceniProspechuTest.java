import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

class VyhodnoceniProspechuTest {

    @Test
    void testProspechVyborne() {
        int[] znamky = {1,1,2,1};
        VyhodnoceniProspechu vp = new VyhodnoceniProspechu();
        assertEquals("výborně", vp.prospech(znamky));
    }

    @Test
    void testProspechChvalitebne() {
        int[] znamky = {2,2,2,2,3,2,1,2};
        VyhodnoceniProspechu vp = new VyhodnoceniProspechu();
        assertEquals("chvalitebně", vp.prospech(znamky));

        /*int[] znamky2 = {1,2};
        assertEquals("chvalitebně", vp.prospech(znamky2));*/
    }
    @Test
    void testProspechDobre() {
        int[] znamky = {3,3,3,3,3,3,3,3,3,3,3,2,1,3};
        VyhodnoceniProspechu vp = new VyhodnoceniProspechu();
        assertEquals("dobře", vp.prospech(znamky));

       /* int[] znamky2 = {2,3};
        assertEquals("dobře", vp.prospech(znamky2));*/
    }
    @Test
    void testProspechDostatecne() {
        int[] znamky = {4,3,4,4};
        VyhodnoceniProspechu vp = new VyhodnoceniProspechu();
        assertEquals("dostatečně", vp.prospech(znamky));

        /*int[] znamky2 = {3,4};
        assertEquals("dostatečně", vp.prospech(znamky2));*/
    }
    @Test
    void testProspechNedostatecne() {
        int[] znamky = {5,5,5,5};
        VyhodnoceniProspechu vp = new VyhodnoceniProspechu();
        assertEquals("nedostatečně", vp.prospech(znamky));

       /* int[] znamky2 = {4,5};
        assertEquals("nedostatečně", vp.prospech(znamky2));*/
    }


}