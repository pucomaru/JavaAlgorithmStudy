import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B;
        String left = ">", right = "<", equal = "==";
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if (A > B) {
            System.out.println(left);
        } else if (A < B) {
            System.out.println(right);
        } else {
            System.out.println(equal);
        }
    }
}

// A, B 범위가 -10,000 ~ 10,000이므로 int 사용, equal이 2글자 이므로 char사용 x