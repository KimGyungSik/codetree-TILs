import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 짝수일 경우에만 2로 나눈 몫을 출력, 3번까지만 
        int n = 0; 
        int cnt = 0; // 카운트가 3이되면 반복문 탈출
        while(cnt!=3) {
            n = s.nextInt();
            if(n%2==0)  {
                System.out.println(n/2);
                cnt++;
            }
        }
    }
}