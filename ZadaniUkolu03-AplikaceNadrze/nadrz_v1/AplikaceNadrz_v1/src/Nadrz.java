/***
 * třída, pracjící s nádrží
 */
public class Nadrz {

    //enum NAPLN { NATURAL95, NATURAL98, NAFTA}

    private double kapacita;

    private double stav;

    // ----

    /**
     * konstruktor, který vytváří nádrž
     * @param kapacita kapacita nádrže
     */
    Nadrz(double kapacita) {
        set_kapacita(kapacita);//this.kapacita = kapacita;
        stav = 0.0;
    }

    /**
     * nastavení hodnoty nádže při vytváření nádrže (nemění se)
     * @param kapacita kapacita nádrže
     */
    private void set_kapacita(double kapacita) {
        if (kapacita > 0.0)
            this.kapacita = kapacita;
    }

    /**
     * získání hodnoty kapacity nádrže
     * @return kapacita kapacita nádrže
     */
    public double get_kapacita()
    {
        return kapacita;
    }

    /**
     * přidání do nádrže
     * @param kolik kolik do nádrže přidáváme
     * @return true/false zda se nám podařilo do nádrže zapsat
     */
    public boolean add(double kolik) {
/*        final double stav_new = stav + kolik;
        if (stav_new <= kapacita) {
            stav = stav_new;
            return true;
        }
        //else
            return false;*/
        if (kolik < 0.0)
            return false;
        final double stav_new = stav + kolik;
        if (stav_new > kapacita)
            return false;

        stav = stav_new;
        return true;
    }

    /**
     * odebrání z nádrže
     * @param kolik kolik z nádrže odebíráme
     * @return true/false zda se nám podařilo z nádrže odebrat
     */
    public boolean remove(double kolik) {
        if (kolik < 0.0)
            return false;
        final double stav_new = stav - kolik;
        if (stav_new < 0.0)
            return false;

        stav = stav_new;
        return true;
    }
}
