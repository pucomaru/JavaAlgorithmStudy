package BJ;

import java.util.Scanner;

public class decoding9046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < T; i++) {
            int[] count = new int[26];
            String password = sc.nextLine();
            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);
                for (int k = 0; k < alphabet.length; k++) {
                    if (ch == alphabet[k]) {
                        count[k]++;
                    }
                }
            }
            int maxCount = 0;
            int maxCountIndex = 0;
            for (int k = 0; k < 26; k++) {
                if (count[k] > maxCount) {
                    maxCount = count[k];
                    maxCountIndex = k;
                }
            }
            int maxCountCount = 0;
            for (int k = 0; k < 26; k++) {
                if (count[k] == maxCount) {
                    maxCountCount++;
                }
            }
            if (maxCountCount > 1) {
                System.out.println("?");
            } else {
                System.out.println(alphabet[maxCountIndex]);
            }
        }
    }
}
