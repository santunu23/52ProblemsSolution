import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob52 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        Pattern match= Pattern.compile(b);
        Matcher word=match.matcher(a);
        int count=0;
        for(int i=0;i<a.length();i++){

        }

        System.out.println(count);
    }
}
