import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1번은 John 2번은 Tom 3번은 Paul 4번은 Sam
        // 이외의 숫자는 Vacancy를 출력
        int n = 0;
        while(n<5) {
            n = s.nextInt();
            if(n==1) System.out.println("John");
            if(n==2) System.out.println("Tom");
            if(n==3) System.out.println("Paul");
            if(n==4) System.out.println("Sam");
        }
        System.out.println("Vacancy");
    }
}