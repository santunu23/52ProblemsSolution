import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Prob37 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int b=sc.nextInt();
            while (b > 0) {
                System.out.print(b % 10);
                b = b / 10;

            }
           --T;
        }

    }
}
