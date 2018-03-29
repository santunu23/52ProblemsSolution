import java.util.Scanner;

public class Prob49 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
            int b=sc.nextInt();
            int count=0;
            for(int i=1;i<=100;i++){
                if(b%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(b+" is a prime");
            }else{
                System.out.println(b+" is not a prime");
            }



            --a;
        }
    }
}
