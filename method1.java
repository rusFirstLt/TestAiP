import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(distance(0,0,1,1));
    }

    static double distance(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
