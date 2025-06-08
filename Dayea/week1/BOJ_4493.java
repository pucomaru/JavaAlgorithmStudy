import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();

        for (int t = 0; t < tc; t++){
            int gameCnt = scanner.nextInt();

            int player1Win = 0;
            int player2Win = 0;

            for (int cnt = 0 ; cnt < gameCnt; cnt++){
                String player1 = scanner.next();
                String player2 = scanner.next();

                if (player1.equals(player2)){
                    continue;
                } else if (
                        (player1.equals("R") && player2.equals("S")) ||
                        (player1.equals("S") && player2.equals("P")) ||
                        (player1.equals("P") && player2.equals("R"))
                ) {
                    player1Win ++;
                } else {
                    player2Win ++;
                }

            }

            if (player1Win > player2Win){
                System.out.println("Player 1");
            } else if (player1Win < player2Win){
                System.out.println("Player 2");
            } else{
                System.out.println("TIE");
            }

        }
    }

}
