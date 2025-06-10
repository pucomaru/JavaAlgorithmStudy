
import java.util.Scanner;

public class Main {

    static class Student{
        String name;
        int day, month, year;

        public Student(String name, int day, int month, int year){
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = scanner.nextInt();

        Student youngest = null;
        Student oldest = null;

        for(int i=0; i < student ; i++){
            String name = scanner.next();
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            Student current = new Student(name, day, month, year);

            if (i == 0){
                youngest = current;
                oldest = current;
            } else {
                if (isYounger(current, youngest)){
                    youngest = current;
                }
                if (isOlder(current, oldest)){
                    oldest = current;
                }
            }
        }

        System.out.println(youngest.name);
        System.out.println(oldest.name);
    }

    static boolean isYounger(Student a, Student b){
        if(a.year != b.year){
            return a.year > b.year;
        } else if (a.month != b.month){
            return a.month > b.month;
        } else {
            return a.day > b.day;
        }
    }

    static boolean isOlder(Student a, Student b){
        if(a.year != b.year){
            return a.year < b.year;
        } else if (a.month != b.month){
            return a.month < b.month;
        } else {
            return a.day < b.day;
        }
    }
}
