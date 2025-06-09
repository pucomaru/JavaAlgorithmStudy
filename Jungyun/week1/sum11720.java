package BJ;

import java.util.Scanner;

public class sum11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        System.out.println(sum1(n, N));
    }
    public static int sum1(String nums, int len) {
        int sum = 0;
        for (int i = 0; i < len; i++){
            char ch = nums.charAt(i);
            sum += ch - '0';
        }
        return sum;
    }
}
