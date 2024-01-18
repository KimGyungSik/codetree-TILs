import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i<=100; i++) {
            if(i>=90) {
                System.out.print("A"+" ");
            }else if(80<=i&&i<90) {
                System.out.print("B"+" ");
            }else if(70<=i&&i<80) {
                System.out.print("C"+" ");
            }else if(60<=i&&i<70) {
                System.out.print("D"+" ");
            }else {
                System.out.print("F"+" ");
            }
    }
}
}