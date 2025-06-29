package week4;

import java.util.Scanner;
// 이상한 점화식 있음...

public class BOJ_4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int x = sc.nextInt();
            int remain = 0;
            int digits = 0;

            do{
                digits ++;
                remain = (remain*10 +1)%x;
            }while(remain != 0);

            System.out.println(digits);
        }
    }
}
