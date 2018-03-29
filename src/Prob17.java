import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       for(int i=0;i<a;i++){
            int count=0;
            String b=sc.nextLine();
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='a'||b.charAt(j)=='e'||
                        b.charAt(j)=='i'||b.charAt(j)=='o'||
                        b.charAt(j)=='u'){
                    count++;
                }
}
            System.out.println("Number of vowels = "+count);
      }


    }
}
