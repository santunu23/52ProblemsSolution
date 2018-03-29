import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            //6 10 15
            int b=sc.nextInt();
            int fact=1;
            for(int j=1;j<=b;j++){
                fact=fact*j;
            }
            System.out.println(fact);

        }
    }
}
