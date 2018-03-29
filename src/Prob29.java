import java.util.Scanner;

public class Prob29 {
    protected  void myFunc(char cf){
        if(cf>='a'&&cf<='z'){
            System.out.println("Lowercase Character");
        }else if(cf>='A'&&cf<='Z'){
            System.out.println("Uppercase Character");
        }else if(cf>='0'&&cf<='9'){
            System.out.println("Numerical Digit");
        }else{
            System.out.println("Special Character");
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       for(int i=0;i<4;i++){
           char b=sc.next().charAt(0);
          Prob29 myfunc=new Prob29();
          myfunc.myFunc(b);
       }

    }
}
