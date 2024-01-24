import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c = "";
        while(!(c.equals("C"))) {
             int a = s.nextInt();
             int b = s.nextInt();
              c = s.next(); 

             System.out.println(a*b);
        }
    }
}