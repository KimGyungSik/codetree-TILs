import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int cnt = 0;

        for(int i=1; i<=n; i++) {
            if(i%4==0)
                cnt++;
            if(!(i%100==0&&i%400!=0))
                cnt++;
        }
        System.out.printf("%d",cnt-n);
    }
}