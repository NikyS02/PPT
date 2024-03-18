public class SpoctiYKvR {

    double calc(KvR kvR, double x) {
        double vys = kvR.getA() * x * x + kvR.getB() * x + kvR.getC();
        return vys;
    }


    double[] calcY(KvR kvR, double[] x) {
        int count = x.length;
        double[] y = new double[count];

        count = 0;
        for(double z : x) {
            y[count] = kvR.getA() * z * z + kvR.getB() * z + kvR.getC();
            count++;
        }
        return y;
    }
}
