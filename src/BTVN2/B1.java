import java.util.Scanner;
public class B1 {
    public static int K_index(int[] a, int n, int k) {
        int left = 0;
        int right = n - 1;
        for(;left<=right;){
            int mid = (left+right) / 2;
            if(a[mid] == k) return mid;
            else if(a[mid] < k) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(K_index(a, n, k));
    }
}
