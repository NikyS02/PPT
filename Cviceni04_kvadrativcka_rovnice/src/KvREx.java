
public class KvREx extends KvR{
    private double x;
    private double y;

    KvREx(double a, double b, double c, double x){
        setA(a);
        setB(b);
        setC(c);
        this.x = x;
        this.y = calcY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double calcY() {
        // y(x) = ax^2 + bx + c
        double y = getA() * getX() * getX() + getB() * getX() + getC();
        return y;
    }
}
