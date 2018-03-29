import java.util.Scanner;

public class Prob22 {
    public int primeNumber(int start,int end){
          int n=end-0;
          int count=0;
        int[] myInt=new int[n];
        boolean[] isPrime=new boolean[n];
        for(int c=start;c<n;c++){
            isPrime[c]=true;
        }

        for(int i=2;i<=end;i++){
            if(isPrime[i-1]){
                myInt[count++]=i;
            }

        for(int j=i*2;j<=isPrime.length;j+=i){
                isPrime[j-1]=false;
        }
        }

        return(count);

    }

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
           int start=sc.nextInt();
           int end=sc.nextInt();
           int n=end-0;
           //System.out.println(n);

           Prob22 primeNum=new Prob22();

          int mynum=primeNum.primeNumber(start,end);
           System.out.println(mynum);




        }

    }
}
