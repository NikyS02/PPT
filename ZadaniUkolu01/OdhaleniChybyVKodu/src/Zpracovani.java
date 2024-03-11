/**
 * Třída slouží k práci s intervaly.
 * Třída používá default konstruktor.
 */
public class Zpracovani {
    /**
     * Funkce řeší, jestli zadané číslo je v daném intervalu.
     * @param odkud číslo odkud, kde začíná interval
     * @param kam číslo od kam, kde končí interval
     * @param value číslo, které porovnáváme
     * @return Vrací true, když je v intervalu a když ne tak false.
     */
    public static boolean interval(int odkud, int kam, int value)
    {
        return (odkud <= value) && (value < kam);
        //return Integer.compare(odkud, value) == -1 && Integer.compare(value, kam) == -1
    }

    /***
     * Funkce generuje vzorky v daném intervalu dle daného kroku.
     * @param kam horní hranice intervalu
     * @param odkud dolní hranice intervalu
     * @param krok rozdíl mezi jednotlivými vzorky
     * @return pole double vzorků
     */
    public double[] vzorkySestupně(double kam, double odkud, double krok)
    {
        final int N = (int)((kam - odkud) / krok - 1);
        double values[] = new double[N];
        double actual = kam - krok;
        int n = 0;
        while (Double.compare(odkud, actual) == -1) {
            values[n++] = actual;
            actual -= krok;
        }
        return values;
    }
}
