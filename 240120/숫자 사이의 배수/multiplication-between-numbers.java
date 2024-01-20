import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int cnt = 0;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt++;
            }
        }

        // 반올림하여 소수점 첫째 자리까지 출력
        double avg = (double) sum / cnt;
        avg = Math.round(avg * 10.0) / 10.0;

        System.out.printf("%d %.1f", sum, avg);
    }
}