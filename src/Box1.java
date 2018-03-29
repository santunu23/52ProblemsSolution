import java.util.Scanner;

public class Box1 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int k=0;k<=a;k++){
            int b=sc.nextInt();
            for(int i=0;i<b;i++){
                for(int j=0;j<b;j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}
