import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long A, B, C;
        long sum;
        Scanner sc = new Scanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
        sum = A + B + C;
        System.out.println(sum);
    }
}

// int로 풀면 런타임에러 발생. 입력이 최대 1조가 들어오기 때문에.