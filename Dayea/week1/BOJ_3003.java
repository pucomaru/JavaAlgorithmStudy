import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correct = {1,1,2,2,2,8};

        int[] current = new int[6];
        for (int i = 0; i < 6 ; i++){
            current[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6 ; i++) {
            System.out.print((correct[i] - current[i]) + " ");
        }
    }

}
