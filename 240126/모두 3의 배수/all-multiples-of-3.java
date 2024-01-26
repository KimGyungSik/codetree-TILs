import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;

        boolean a = false;
        for(int i=0; i<5; i++) {
            n = s.nextInt();
            if(n%3!=0) {
                a = true;
            }
        }
        System.out.println(a ? 0 : 1);
    }
}