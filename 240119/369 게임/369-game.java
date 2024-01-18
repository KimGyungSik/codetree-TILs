import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        //3의 배수이거나 숫자에 3,6,9가 하나라도 들어가있으면 0으로 출력
        // 그렇지 않으면 그대로 숫자 출력

        for(int i=1; i<=n; i++) {
            if(i%3==0 || (i%10==3&&i%10==6&&i%10==9)) {
                System.out.print(0+" ");
            }else {
                System.out.print(i+" ");
            }
        }



    }
}