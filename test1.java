import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(((n%4)==0 && (n%100)!=0) || (n%400)==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
