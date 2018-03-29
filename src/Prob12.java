import java.util.ArrayList;
import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        long count=1;

        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            for(int j=1;j<=b;j++){
                count=count*j;
            }
            int zero_count=0;
               while(count>0) {

                   long mod = 0;
                   mod = count % 10;
                   if (mod == 0) {
                       zero_count++;

                   } else {
                        break;
                   }
                   count = count / 10;
               }

            System.out.println(zero_count);
        }
    }
}
