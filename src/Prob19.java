import java.util.ArrayList;
import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            String b=sc.nextLine();
            int c=b.length()-b.replaceAll(" ","").length();
            System.out.println("Count = "+(c+1));
        }


    }
}
