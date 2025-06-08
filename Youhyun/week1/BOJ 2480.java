import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dice1, dice2, dice3;
        int total = 0;
        int maxnum;
        Scanner sc = new Scanner(System.in);
        dice1 = sc.nextInt();
        dice2 = sc.nextInt();
        dice3 = sc.nextInt();
        maxnum = dice1;
        if (maxnum < dice2) {
            maxnum = dice2;
        }
        if (maxnum < dice3) {
            maxnum = dice3;
        }

        if  (dice1 == dice2 && dice2 == dice3) {
            total += 10000 + dice1 * 1000;
        } else if (dice1 == dice2) {
            total += 1000 + dice1 * 100;
        } else if (dice1 == dice3) {
            total += 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            total += 1000 + dice2 * 100;
        } else {
            total += maxnum * 100;
        }

        System.out.println(total);

    }
}

//