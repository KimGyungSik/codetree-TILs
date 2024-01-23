import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 나눗셈을 진행한 총 횟수를 담을 변수
        int answer = 0;
        // 나눗셈을 시작할 숫자
        int i = 1;
        // 몫이 1이하가 되는 순간 반복문 종료
        while(n>=1) {
            n = n/i++;
        }
        System.out.println(i);
    }
}