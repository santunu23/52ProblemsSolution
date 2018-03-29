import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
//        int fact=1;
//        int number=15;
//        for(int i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int count=1;
        for(int i=1;i<=a;i++){
            count*=i;
        }
        System.out.println(count);




    }
}
