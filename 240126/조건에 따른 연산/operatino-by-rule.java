import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       int n = s.nextInt();
       int cnt = 0;
        // n이 짝수면 n = n*3+1
        // n이 홀수면 n = n*2+2
        int i = n;
       while(i<=1000) {
            if(i%2==0)
                i = i*3+1;
            else 
                i = i*2+2;
                
            cnt++;
       }
       System.out.println(cnt);
    }
}