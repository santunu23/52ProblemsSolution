import java.util.Scanner;
public class Prob46 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int s=0;
            double area=0.0;
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            s=(b+c+d)/2;
            area=Math.sqrt(s*(s-b)*(s-c)*(s-d));
            System.out.println("Area = "+area);
        }

    }
}
