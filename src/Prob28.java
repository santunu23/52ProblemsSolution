import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int count=0;
            int[] myArray=new int[b];
            boolean myName=true;
            for(int j=0;j<b;j++){
                myArray[count++]=sc.nextInt();
            }

            for(int k=0;k<myArray.length-1;k++){
//                System.out.println(myArray[k]);
                if(myArray[k]>myArray[k+1]){
                    myName=true;
                }else{
                    myName=false;
                }
            }

            if(myName==true){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }



    }
}
