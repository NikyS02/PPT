public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        provider provider = new provider();
        Double[][] in = provider.NacteniDat_DataKvadratickeRovnice();
        for(Double[] d : in) {
            for (Double x : d) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

}