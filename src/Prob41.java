import java.util.Scanner;

public class Prob41 {
    public static long myFact(long n){
        long fact=1;
        for(long i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
             int b=sc.nextInt();
             float c=0;
             for(int i=1;i<b;i++){
                 c+=(double)i/myFact(i);
             }
            System.out.println(c);
            --a;
        }
    }
}
