import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cnt = 0;
        int a = 0;
        for(int i=0; i<10; i++) {
            a = s.nextInt();
            if(a%2!=0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}