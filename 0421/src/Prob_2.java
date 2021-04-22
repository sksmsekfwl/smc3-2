import java.util.Scanner;

public class Prob_2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=0;
        int i=4;
        int sum=0;
        System.out.println("1000 이하의 자연수를 입력하세요.");
        num1 = scan.nextInt();

            for(int j=1;j<=1000;j++){
                if(i*j<=num1){
                    System.out.println(i*j);
                    sum = sum+i*j;
                }
                else
                    break;
            }
        System.out.println("1~"+num1+"까지 4의 배수의 합은 "+sum+"입니다.");
    }
}