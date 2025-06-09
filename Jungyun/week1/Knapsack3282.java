package swea;

import java.util.Scanner;

public class Knapsack3282 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] weights;
            int[] values;
            weights = new int[N + 1];
            values = new int[N + 1];
            weights[0] = values[0] = 0;

            for (int i = 1; i < N + 1; i++) {
                weights[i] = sc.nextInt();
                values[i] = sc.nextInt();
            }

            int[][] dp = new int[N + 1][K + 1];
            for (int i = 1; i <= N; i++) {
                dp[i][0] = 0;
            }
            for (int i = 1; i <= K; i++) {
                dp[0][i] = 0;
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= K; j++) {
                    if (j - weights[i] >= 0) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i - 1][j-weights[i]] + values[i]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            System.out.println("#" + test_case + " " + dp[N][K]);
        }
    }
}
























