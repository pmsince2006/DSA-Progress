// Single number 2 
// Detecting a single number but array contains pairs of 3 numbers
import java.util.*;
public class single2 {
    static int singlenum(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 1; i < n ; i += 2){
            if(arr[i] != arr[i-1]){
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,4,4,4};

        int result = singlenum(arr);

        System.out.println("Single Number: "+result);
    }
    
}
