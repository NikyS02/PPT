/**
 * Třída porovnává čísla.
 * Třída používá default konstruktor.
 */
public class ZpracovaniMoje {
    /**
     * Porovnává dvě čísla.
     * @param a první číslo int
     * @param b druhé číslo int
     * @return Když je číslo a menší než číslo b, vrátí -1. Číslo a > b, vrátí 1, a=b, vrátí 0.
     */
    public static int comp(int a, int b) {
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
    }

    /**
     * Porovnává dva řetězce znaků.
     * @param a První řetězec
     * @param b Druhý řetězec
     * @return Pokud jsou stejné, vrátí 1. Pokud ne, vrátí -1.
     */
    public static int comp(String a, String b)
    {
        if(a.equals(b)) return 1;
        return -1;
    }
}
