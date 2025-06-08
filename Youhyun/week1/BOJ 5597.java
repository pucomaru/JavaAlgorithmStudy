import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int endNum = 31;
        int stNum, temp;
        int minNum = 100, maxNum = 0;
        int[] students = new int[endNum];
        while (cnt < (endNum - 3)) {
            stNum = scanner.nextInt();
            students[stNum] = 1;
            cnt++;
        }
        for (int i = 1; i < endNum; i++) {
            if (students[i] == 0) {
                if (i < minNum) {
                    temp = minNum;
                    minNum = i;
                    maxNum = temp;
                } else {
                    maxNum = i;
                }
            }
        }
        System.out.println(minNum);
        System.out.println(maxNum);
    }
}
