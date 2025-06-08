package swea;


import java.util.Scanner;

public class intervalsum23145 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for (int tc = 1; tc < T+1; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i <= N - M; i++) {
                int tempSum = 0;
                for (int j = 0; j < M; j++){
                    tempSum += arr[i+j];
                }
                if (tempSum < min) {
                    min = tempSum;
                }
                if (tempSum > max) {
                    max = tempSum;
                }
            }
            System.out.println("#" + tc + " " + (max - min));
        }
    }
}
