import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prob47 {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      ArrayList<Integer> myArrayList=new ArrayList<Integer>();
      while(a>0){
          int b=sc.nextInt();
          for(int i=0;i<b;i++){
              myArrayList.add(sc.nextInt());
          }
          Collections.sort(myArrayList);
          System.out.println(myArrayList);
          --a;
      }
     // int[] myArray=myArrayList.toArray(new int[myArrayList.size()]);
//      int count=0;
//       for(int i=0;i<myArray.length;i++){
//           //myArray[count++]=myArrayList;
//       }


  }
}
