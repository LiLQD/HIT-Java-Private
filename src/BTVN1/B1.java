import java.util.Scanner;
public class B1 {
    public static void convert(int a, int b) {
        if (a == 0) return;
        String result = "";
        while (a > 0) {
            int remain = a % b;
            if (remain < 10) result = remain + result;
            else result = (char) (remain - 10 + 'A') + result;
            a /= b;
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        convert(a, b);
    }
}