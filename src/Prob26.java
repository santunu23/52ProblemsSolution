import java.util.Scanner;

public class Prob26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            double b = sc.nextDouble();
            int count = 0;
            while (b > 1.00) {
                b = b / 2;
                count++;
            }
            System.out.println(count+" days");
        }
    }
}
