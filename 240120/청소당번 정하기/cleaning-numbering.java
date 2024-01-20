import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int two = 0;
        int three = 0;
        int twoeleve = 0;

        for(int i=1; i<=n; i++) {
            if(i%12==0) 
                twoeleve++;
            else if(i%3==0)
                three++;
            else if(i%2==0)
                two++;
        }
        System.out.printf("%d %d %d",two,three,twoeleve);
    }
}