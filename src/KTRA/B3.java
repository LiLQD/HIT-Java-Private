import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        while(x < -100 || x > 100) x = sc.nextDouble();
        int y = sc.nextInt();
        while(y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) y = sc.nextInt();

        double result = Math.pow(x, y);
        System.out.println(result);
    }
}
