import java.util.Scanner;
public class B3 {
    public static void Biggest(int n, int[] a){
        if(n == 1){
            System.out.println(a[0]);
            return;
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[0]+ " " + a[1] );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[30];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Biggest(n, a);
    }
}
