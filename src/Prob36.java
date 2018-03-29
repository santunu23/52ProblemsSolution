import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prob36 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<String> myArrayList=new ArrayList<String>();
        for(int i=0;i<a;i++){
            myArrayList.add(sc.next());
        }

        Collections.sort(myArrayList);
        System.out.println(myArrayList);


//        String[] myArray=new String[a];
//        int count=0;
//        for(int i=0;i<myArray.length;i++){
//            myArray[count++]=sc.next();
//        }
//        Arrays.sort(myArray);
//        for(int i=0;i<myArray.length;i++){
//            System.out.println(myArray[i]);
//        }

    }
}
