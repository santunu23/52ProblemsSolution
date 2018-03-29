import java.util.Scanner;

public class Prob38 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=0;i<a;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(b+" ");
                }
                System.out.println("");
            }

            for(int i=a;i>=1;i--){
                for(int j=1;j<i;j++){
                    System.out.print(b+" ");
                }
                System.out.println(" ");
            }






            --T;
        }






    }
}
