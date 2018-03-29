import java.util.Scanner;

public class Runrate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testCase=Integer.parseInt(sc.nextLine());

        while(testCase>0){
            int firstball=sc.nextInt();
            int lastball=sc.nextInt();
            int ball=sc.nextInt();
            int ballplayed=300-ball;
            double first=firstball*1.0;
            double last=lastball*1.0;
            double ba=ball*1.0;
            double currentrarte=(first/last)*6;
            double askrr=((first-last+1)/ba)*6;
            testCase--;
            System.out.println(currentrarte+" "+askrr);
        }

    }
}
