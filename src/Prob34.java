import java.util.Scanner;

public class Prob34 {
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
    for(int i=0;i<a;i++){
          int b=sc.nextInt();
          int c=sc.nextInt();
          int d=sc.nextInt();
          for(int j=1;j<=d;j++){
              if(j%b==0&&j%c==0){
                  System.out.println(j);
              }
          }
    }

}
}
