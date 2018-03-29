import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob51 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        while(a>0){
            String b=sc.next();
            String c=sc.next();
            Pattern word=Pattern.compile(c);
            Matcher mat=word.matcher(b);
            while(mat.find()){
                System.out.println(mat.start());
            }

            --a;
        }
}
}
