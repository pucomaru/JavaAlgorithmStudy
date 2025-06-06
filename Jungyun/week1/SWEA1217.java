import java.util.Scanner;

public class Power1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int tc = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println("#"+tc+" "+Power(N, M));
        }
    }
    static int Power(int N, int M) {
        int X = 1;
        for (int i = 1; i <= M; i++) {
            X = X * N;
        }
        return X;
    }
}
