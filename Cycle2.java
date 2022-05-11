import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 1) {
            int i = 2;
            while (i < 10) {
                if (n % i == 0) {
                    break;
                } else {
                    i++;
                }
            }
            System.out.println(i);
        }
    }
}
