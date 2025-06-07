
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        과목 수 입력
        int subject = scanner.nextInt();
//        점수 최고점
        double M = 0;
//        공백제거
        scanner.nextLine();
//        점수 입력
        String scoreinput = scanner.nextLine();
        String[] tokens = scoreinput.split(" ");
//        점수 배열
        double[] scores = new double[subject];
//        문자열 정수변환 + 최댓값 갱신
        for(int i = 0; i < subject; i++){
            scores[i] = (double)Integer.parseInt(tokens[i]);
            if (scores[i] >= M){
                M = scores[i];
            }
        }

        double[] newScore = new double[subject];

        for (int i = 0 ; i < subject ; i++){
            newScore[i] = scores[i] / M * 100;
        }

        double avg = 0;
        double sum = 0;
        for (int i = 0 ; i < subject ; i++){
            sum += newScore[i] ;
        }

        avg = sum / subject;

        System.out.println(avg);

    }
}
