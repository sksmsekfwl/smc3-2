import java.util.Scanner;

public class Prob_3 {
    public static void main(String[] args) {
        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력>>");
        Scanner scan=new Scanner(System.in);
        int math = scan.nextInt();
        int science = scan.nextInt();
        int english = scan.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average());


    }
}
class Grade {
       int math;
       int science;
       int english;
       Grade(int math, int science, int english) {
          this.math = math;
          this.science = science;
          this.english = english;
       }
       public int average() {
          return (math + science + english) / 3;
       }
}