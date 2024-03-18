public class KvR {
    private double a;
    private double b;
    private double c;

    KvR() {}
    KvR(double a, double b, double c)
    {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    protected void setA(double a) {
        this.a = a;
    }

    protected void setB(double b) {
        this.b = b;
    }

    protected void setC(double c) {
        this.c = c;
    }

}
