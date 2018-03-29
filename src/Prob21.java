import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Prob21 {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        for(int i=0;i<a;i++){
//            String b=sc.next();
//             char[] ab=b.toCharArray();
//             for(int j=ab.length-1;j>=0;j--){
//                 System.out.print(ab[j]);
//             }
//
//        }

          String a="Joy";
          char[] helio=a.toCharArray();
          ArrayList<Character> myArrList=new ArrayList<Character>();
          for(char c:helio){
              myArrList.add(c);
          }
        Collections.reverse(myArrList);
        ListIterator li=myArrList.listIterator();
        while(li.hasNext()){
            System.out.print(li.next());
        }


    }
}
