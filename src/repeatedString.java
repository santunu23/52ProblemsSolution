import com.sun.deploy.util.StringUtils;

import java.util.Collections;
import java.util.Scanner;

public class repeatedString {
//   static long repeatedString(String s, long n) {
//        StringBuilder builder=new StringBuilder();
//        for(int i=0;i<n;i++){
//            builder.append(s);
//        }
//        String d=builder.toString();
//        char[] ch=new char[(int) n];
//        long count=0;
//        for(int i=0;i<n;i++){
//            ch[(int) count++]=d.charAt((int) i);
//        }
//        int dcount=0;
//        for(long j=0;j<ch.length;j++){
//            if(ch[(int) j]=='a'){
//                dcount++;
//            }
//
//        }
//       return dcount++;
//}

   public static void main(String[] args){
//       Scanner in = new Scanner(System.in);
//       String s = in.next();
//       long n = in.nextLong();
//       long result = repeatedString(s, n);
//       System.out.println(result);
//       in.close();

//       String str="abc";
//       String repeated="";
//       long n=1000000000000L;
//       String s="a";
//       repeated = new String(new char[n]).replace("\0", s);
//       System.out.println(repeated);



//       Scanner in = new Scanner(System.in);
//       String s = in.next();
//       long n = in.nextLong();
//       long count =0;
//       for(char c : s.toCharArray())
//           if(c == 'a')
//               count++;
//
//       long factor = (n/s.length());
//       long rem = (n%s.length());
//       count =  factor*count  ;
//       for(int i=0;i<rem;i++)
//           if(s.charAt(i)=='a')
//               count++;
//       System.out.println(count);
       String s="aba";
       long n=10;
       long count=0;
       for(char c:s.toCharArray())
           if(c=='a')
               count++;
       long factor=(n/s.length());
       long rem=(n%s.length());
       System.out.println(n%s.length());
       count=factor*count;
       for(int i=0;i<rem;i++)
           if(s.charAt(i)=='a')
               count++;
       System.out.println(count);

    }
}
