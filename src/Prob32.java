import java.util.Scanner;

public class Prob32 {
    public void myfunc(int n,int m){
    if(n>m){
        System.out.println("Invalid");
    }else{
        for(int i=n;i<=m;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }



 }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        Prob32 myFunc=new Prob32();
        int b=sc.nextInt();int c=sc.nextInt();
        myFunc.myfunc(b,c);

    }

 }

}
