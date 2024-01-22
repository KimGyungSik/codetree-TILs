import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            int a = s.nextInt();
            sum += a;
            cnt++;
        }

        double avg = (double) sum/cnt;
        System.out.printf("%d %.1f",sum,avg);

        

    }
}