import java.util.ArrayList;
import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        ArrayList<String> myArrayList=new ArrayList<String>();
        for(int i=0;i<a;i++){
          for(int j=0;j<b.length();j++){
              System.out.println(b.charAt(j));
          }
        }
        myArrayList.add("Joy");
        System.out.println(myArrayList.size());
    }
}
