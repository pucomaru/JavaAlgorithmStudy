import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int check[] = new int[30];

        for (int i = 0; i < 28 ; i++){
            int submitNum = scanner.nextInt();
            check[submitNum-1] += 1;
        }

        for(int i = 0; i < 30 ; i++){
            if (check[i] != 1){
                System.out.println(i+1);
            }
        }

    }
}
