import java.util.*;

public class Prob27 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int mynum=b;
            int count=0;
        while(b>0){
                int c=b%10;
                int d= (int) Math.pow(c,3);
                count=d+count;
                b=b/10;
               }
              if(count==mynum){
                System.out.println(mynum+" is an armstrong number!");
            }else{
                System.out.println(mynum+" is not an armstrong number!");
            }

        }


    }
}
