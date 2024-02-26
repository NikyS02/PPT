public class ZpracovaniMoje {

    public static int comp(int a, int b) {
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
    }

    public static int comp(String a, String b)
    {
        if(a.equals(b)) return 1;
        return -1;
    }
}
