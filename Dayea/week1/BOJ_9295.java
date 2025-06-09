import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for(int i = 1; i <= count; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a+b;

            System.out.println("Case "+i+": "+sum);
        }

    }
}
