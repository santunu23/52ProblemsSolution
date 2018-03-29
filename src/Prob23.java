import java.util.Scanner;

public class Prob23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            String b=sc.next();
            for(int j=0;j<b.length();j++){
                char c=b.charAt(j);
                int d=((int)c-64);
                System.out.print(d);
            }
        }
    }

}
