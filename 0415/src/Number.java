import java.util.Scanner;
import java.util.Random;
public class Number {

    public static void main(String[] args) {

        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a,b = 0;

        Random random = new Random();
        for (int i=0;i<10;i++) {
            a = random.nextInt(50)+1;
            System.out.print(a+" ");
            if (a==num) {
                b=1;
            }
        }

        
      
        if(b==1){
            System.out.println("\n��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
        }
        else {
            System.out.println("\n�ƽ�����! ��ġ�ϴ� ���ڰ� �����ϴ�.");
        }


    }
}