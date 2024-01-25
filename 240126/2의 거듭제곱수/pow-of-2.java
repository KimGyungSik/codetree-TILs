import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       int n = s.nextInt();
       int cnt = 1;
       int i = 0;
        // 4 = 2*2 8 = 2*2*2
       while(cnt!=n) {
            cnt = cnt*2;
            i++;
       }
       System.out.println(i);
    }
}