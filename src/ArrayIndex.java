import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayIndex {
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        // make an array of the products
//        int[] myinArray=new int[intArray.length];
//        int count=0;
//        int index=0;
//        for(int i=0;i<intArray.length;i++){
//            count*=intArray[i];
//        }
//
//        for(int i=0;i<intArray.length;i++) {
//
//            myinArray[count++] = count - intArray[i];
//        }
        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray.length;j++){
                if(intArray[i]!=intArray[j]){
                    int a=intArray[i]*intArray[j];
                }
            }
        }


        return new int[intArray.length];
    }

    public static void main(String[] args) {
        int[] intArray = {1, 7, 3, 4};
        int[] result = getProductsOfAllIntsExceptAtIndex(intArray);
        for (int value : result) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }
}
