import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, M;
        int sum = 0;
        N = scanner.nextInt();
        M = scanner.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if ((cards[i] + cards[j] + cards[k] > sum) && (cards[i] + cards[j] + cards[k] <= M)) {
                        sum = cards[i] + cards[j] + cards[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
