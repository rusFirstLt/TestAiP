package TestOstZnania;

public class method2 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;

        double x2 = 2;
        double y2 = 4;

        double x3 = 4;
        double y3 = 2;

        double A = length(x1, y1, x2, y2);
        double B = length(x1, y1, x3, y3);
        double C = length(x2, y2, x3, y3);
        double P = A+B+C;

        System.out.println("Периметр треугольника = " + P);
    }

    static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
