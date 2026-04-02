//Print all subsequence
//Subsequence is contigous | non contingous sequence which allows the order 
// Number of subsequence for an array with n elements will be 2^n

public class first{
  
  public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsequences(arr, 0, new ArrayList<>());
  }

  // static void subsequences(int[] arr, int i, ArrayList<Integer> list){
    
  //       if(i == arr.length){
  //           System.out.println(list);
  //           return;
  //       }

  //       list.add(arr[i]);
  //       subsequences(arr, i + 1, list);

  //       list.remove(list.size() - 1);

  //       subsequences(arr, i + 1, list);
  //   }

  // static void subsequences(int[] arr, int i, String ans){
    
  //       if(i == arr.length){
  //           System.out.println(ans);
  //           return;
  //       }

  //       subsequences(arr, i + 1, ans + arr[i] + " ");

  //       subsequences(arr, i + 1, ans);
        
  //   }


  static void subsequnecesum(int[] arr,int i,int s, int sum,ArrayList<Integer> list){

        if(i == arr.length){
            if(s == sum){
                System.out.println(sum);
            }
            return;
        }

        list.add(arr[i]);
        subsequnecesum(arr, i+1, s + arr[i],sum,list);

        list.remove(list.size() - 1);
        subsequnecesum(arr,i + 1,s,sum,list);

    }
}
