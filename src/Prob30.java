import java.util.Scanner;

public class Prob30 {

    protected  void myFunc(int num){
       int count=0;
        for(int i=1;i<num;i++) {
            if (num % i == 0) {
                count = i + count;
            }
        }
        //System.out.println(count);
        String result=(count==num)?"YES,"+num+" is a perfect number!":"No,"+num+" is not a perfect number!";
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            Prob30 myFu=new Prob30();
            myFu.myFunc(b);
        }

    }
}
