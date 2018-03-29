import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prob48 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> myArrayList=new ArrayList<Integer>();
        int a=sc.nextInt();

        while(a>0){
           int b=sc.nextInt();
           for(int i=1;i<=b;i++){
               myArrayList.add(i);
           }
           for(int i=1;i<b;i++) {
               if (!myArrayList.contains(sc.nextInt())) {
                   System.out.println();
               }
           }



//           int[] myArray=new int[b-1];
//           int count=0;
//            for(int j=1;j<b;j++){
//               myArray[count++]=sc.nextInt();
//            }

//            for(int i=0;i<myArray.length;i++){
//                System.out.println(myArray[i]);
//            }



           --a;
             }


        }
}

