import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int cnt =0;
        int sum = 0;
        double avg = 0;
        while(true) {
            n = s.nextInt();
            if(!(20<=n&&n<=29))
                break;
            sum += n;            
            cnt++;
        }
        avg = (double) sum/cnt;
        System.out.printf("%.2f",avg);
    }
}