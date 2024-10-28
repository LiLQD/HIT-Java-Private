import java.util.Scanner;
public class B2 {
    public  static void product(int a){
        int result = 1;
        while(a > 0){
            int lastNumber = a % 10;
            result *= lastNumber;
            a /= 10;
        }
        System.out.println("Result = " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        product(a);
    }
}
