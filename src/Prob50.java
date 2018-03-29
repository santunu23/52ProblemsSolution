import java.util.Scanner;

public class Prob50 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
            String b=sc.next();
            char[] c=b.toCharArray();
            for(int i=0;i<c.length-1;i++){
                if(c[i]=='L'){
                    //char temp=c[i];
                    c[i]=c[i-1];
                }else if(c[i]=='R'){
                    //char temp=c[i];
                    c[i]=c[i+1];
                }
            }

            for(int j=0;j<c.length;j++){
                System.out.print(c[j]);
            }

           --a;
        }
    }
}
