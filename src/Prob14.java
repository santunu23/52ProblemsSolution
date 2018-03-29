import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int count = 0;
        for (int i = 0; i < a; i++) {
            int count = 0;
            String b = sc.nextLine();
            char d=sc.next().charAt(0);
            char[] e=b.toCharArray();
            for(int j=0;j<e.length;j++){
                if(d==e[j]){
                   count++;
                }
            }
            if(count==0){
                System.out.println(d+" is not present");
            }else {
                System.out.println("Occurrence of "+ d+" in "+"'"+ b+ "'"+ " ="+count);
            }
        }

    }

}

