public class first{
  public static void main(String[] args) {
        System.out.println();
    }

   //Function to reverse an array using two parameters
    // static void rev(int[] arr, int start, int end){

    //     if(start >= end){
    //         return;
    //     }

    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;

    //     rev(arr, start + 1, end - 1);
    // }


 // Function to reverse an array using single parameter
    // static void rev(int[] arr, int i){
    //     int n = arr.length;
    //     if(i >= n / 2){
    //         return;
    //     }

    //     int temp = arr[n - i - 1];
    //     arr[n - i - 1] = arr[i];
    //     arr[i] = temp;

    //     rev(arr, i  + 1);
    // }



   // Function to check if a string is a palindrome using recursion
    // static boolean palindrome(String s,int i){
    //     char[] arr = s.toCharArray();
    //     int n = arr.length;

    //     if(i >= n / 2){
    //         return true;
    //     }

    //     if(arr[i] != arr[n - i - 1]){
    //         return false;
    //     }
    //     return palindrome(s,i + 1);
    // }



   // Alternate approach using while loop
    // static boolean isPalindrome(String str){
    //     int i = 0;
    //     int j = str.length() - 1;

    //     while(i < j){
    //         if(str.charAt(i) != str.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}
