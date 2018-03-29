import java.util.Scanner;

public class Prob24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int count=0;
            int[] myArray=new int[b];
            for(int j=0;j<b;j++){
                myArray[count++]=sc.nextInt();
            }
            for(int k=0;k<myArray.length;k+=2){
                System.out.print(myArray[k]+" ");
            }
        }


            }
}
