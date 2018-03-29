import java.util.HashMap;
import java.util.HashSet;

public class Prob16 {
    public static void main(String[] args){
        String a="This is a test";
        System.out.println("Size of the string is "+a.length());
        char[] b=new char[a.length()];
        b=a.toCharArray();
        HashSet<Character> myHashset=new HashSet<Character>();
        for(int i=0;i<b.length-1;i--){
            System.out.print(b[i]);
            //myHashset.add(b[i]);
        }

        //   System.out.print(c);

    }
}
