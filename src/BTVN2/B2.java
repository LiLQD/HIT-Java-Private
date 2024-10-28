import java.util.Scanner;
public class B2 {
    public static long sum(int[] a, int n, int k){
        long max, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        max = sum;
        for (int i = k; i < n; i++) {
            sum += a[i] - a[i - k];
            if(sum > max) max = sum;
        }
        for (int length = k + 1;length <= n;length++){
            sum = 0;
            for (int i = 0; i < length; i++) {
                sum += a[i];
            }
            if(sum > max) max = sum;
            for (int j = length; j < n; j++) {
                sum += a[j] - a[j - length];
                if(sum > max) max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a, n, k));
    }
}
