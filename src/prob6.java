import java.util.ArrayList;
import java.util.Scanner;

public class prob6 {

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int d=0;
      int e=0;
      for(int i=0;i<a;i++){
          String b=sc.next();
          char[] c=b.toCharArray();
          for(int j=0;j<c.length;j++){
              e=Character.getNumericValue(c[0]);
              d=Character.getNumericValue(c[c.length-1]);


          }
          System.out.println("Sum = "+ d+e);
      }


    }
}
