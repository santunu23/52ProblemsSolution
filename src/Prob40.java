import java.util.Scanner;

public class Prob40 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            double power=1;
            int sum=1;
            for(int i=1;i<=c;i++){
                    power=Math.pow(b,i);
                    sum+=power;
            }
            System.out.println("Result = "+sum);

         --a;
        }
    }
}
