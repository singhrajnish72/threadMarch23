package threadMarch23.DSA.InterviewQuestions;

public class DeleteAtMostOneElement {
  
  
  public static int maximumSum(int[] arr) {
    int N = arr.length;
    int bef[] = new int[N];
    int aft[] = new int[N];

    if(N == 1){
        return arr[0];
    }

    bef[0] = arr[0];
    aft[N - 1] = arr[N - 1];
    int ans = Integer.MIN_VALUE;

    //Take contribution of each element from left side
    for(int i = 1; i < N; i++){
        bef[i] = Math.max(bef[i - 1] + arr[i], arr[i]);
        ans = Math.max(ans,bef[i]);
    }
    
    ////Take contribution of each element from right side
    for(int i = N - 2; i >= 0; i--){
        aft[i] = Math.max(aft[i + 1] + arr[i], arr[i]);
        ans = Math.max(ans,aft[i]);
    }

    //Remove one element and check for max sum by add bef[i - 1] + aft[i + 1]
    for(int i = 1; i < N - 1; i++){
        ans  = Math.max(ans,bef[i - 1] + aft[i + 1]);
    }
     
   return ans;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int arr[] = {1, -2, 0 , 3};
    //output -> 4
    int arr1[] = {-1, -1, -1 , -1};
    //output -> -1
    int arr2[] = {1, -2, -2 , 3};
    //output -> 3
    
    System.out.println("ans:"+maximumSum(arr));
    System.out.println("ans1:"+maximumSum(arr1));
    System.out.println("ans2:"+maximumSum(arr2));

  }

}
