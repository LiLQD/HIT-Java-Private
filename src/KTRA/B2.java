import java.util.Scanner;
public class B2 {
    public static void separate(String a){
        int n = a.length();
        String letters = "";
        String digits = "";
        for (int i = 0; i < n; i++) {
            char c = a.charAt(i);
            if (Character.isDigit(c)) digits += c;
            else letters += c;
        }
        System.out.println(letters);
        System.out.println(digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        separate(a);
    }
}
