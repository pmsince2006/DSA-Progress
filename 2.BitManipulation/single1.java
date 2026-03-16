// To calclulate single number in a array 
// Using XOR Operator (same gives 0, diff gives 1)
public class single1 {
    static int singlenum(int[] arr){
        int n = arr.length;
        int single = 0;

        for(int i = 0; i < n;i++){
            single = single ^ arr[i];
        }

        return single;
    }

    public static void main(String[] args) {

        int[] arr = {9,3,3,4,4,5,5};

        int result = singlenum(arr);

        System.out.println("Single number is: "+result);
    }
}
