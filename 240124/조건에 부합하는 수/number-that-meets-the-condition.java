import java.util.*;
public class Main {
    public static void main(String[] args) {
        //1부터 a까지 만족하지 않는 수 출력
        // 짝수이면서 4의 배수가 아닌수
        // 8로 나눈 몫이 짝수인 수
        // 7로 나눈 나머지가 4보다 작은 수
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1; i<=a; i++) {
            int b = i/8;
            int c = i%7;
            if(i%2==0&&i%4!=0)
                continue;
            else if(b%2==0)
                continue;
            else if(c<4)
                continue;

            System.out.print(i+" ");
        }
    }
}