import java.util.Scanner;

public class SievPrimechecker {
    public static void main(String[] args){
        int n=20;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        sc.close();

        //init our numbers array,where true denotes primality
        boolean[] isPrime=new boolean[n];
       // isPrime[0]=true;

        for(int c=0;c<n;c++){
            isPrime[c]=true;
        }

        //check every number>=2 for primarly
        for(int i=2;i<=n;i++){
            //i is prime if hasn't been
            if(isPrime[i-1]){
                System.out.println(i);
            }
            //"cross off" all the susequentmultiples of i
            for(int j=2*i;j<=n;j+=i){
             isPrime[j-1]=false;
            }

        }
    }
}
