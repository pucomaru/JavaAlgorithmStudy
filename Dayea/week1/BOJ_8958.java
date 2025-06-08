import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < tc; t++){
            String score = scanner.nextLine();

            int totalScore = 0;
            int zeroCnt = 0;

            for (int i = 0; i < score.length() ; i++){

//               문자를 비교할 때는 "" 말고 ''
//                char 타입끼리는 값 자체를 비교하는데 String 타입끼리는 객체참조(주소)를 비교하고 .equals() ㅅ용
                if (score.charAt(i) == 'O'){
                    zeroCnt ++;
                    totalScore += zeroCnt;
                } else {
                    zeroCnt = 0;
                }
            }

            System.out.println(totalScore);

        }
    }
}
