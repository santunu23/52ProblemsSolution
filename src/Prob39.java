import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class Prob39 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0) {
            String b = sc.next();
            int index=0;
            char[] myArray = b.toCharArray();
            int count=0;
            char[] myArrayNew=new char[myArray.length];
            for (int i = myArray.length - 1; i >= 0; i--) {
                myArrayNew[count++]=myArray[i];
            }
            String c= String.copyValueOf(myArrayNew);
           for(int i=0;i<b.length();i++){
                   // System.out.println(b.charAt(i)+""+c.charAt(i));
                    if(b.charAt(i)==c.charAt(i)){
                        index++;
                    }
            }
            if(index==c.length()){
                System.out.println("Yes!It is palindrome");
            }else{
                System.out.println("Sorry!It is not palindrome!");
            }
            --a;
        }
    }
}
