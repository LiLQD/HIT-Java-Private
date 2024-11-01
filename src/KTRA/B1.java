import java.util.Scanner;
public class B1 {
    private static final String[] dv = { "", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin" };
    private static final String[] chuc = { "", "muoi", "hai muoi", "ba muoi", "bon muoi", "nam muoi", "sau muoi", "bay muoi", "tam muoi", "chin muoi" };
    public static void convert(int n) {
        if (n == 0) {
            System.out.println("khong");
            return;
        }

        if (n / 100 > 0) {
            System.out.print(dv[n / 100] + " " + "tram" + " ");
            n %= 100;
        }

        if (n / 10 > 0) {
            if (n < 20) {
                if (n == 10) System.out.print("mười ");
                else System.out.print("mười " + dv[n % 10] + " ");
            }
            else {
                System.out.print(chuc[n / 10] + " ");
                if (n % 10 != 0) System.out.print(dv[n % 10] + " ");
            }
        }
        else System.out.print(dv[n] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(;n >= 1000;) n = sc.nextInt();
        convert(n);
    }
}
