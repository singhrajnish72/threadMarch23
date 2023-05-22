package threadMarch23.DSA.InterviewQuestions;


/*
 * Smallest subarray with sum greater than a given value
 * time - O(NlogN)
 */
public class SubarrayTargetSum {

	public static boolean slidingWindow(int arr[], int k, int target) {
		 int sum  = 0 ; 
		 for(int i = 0; i < k; i++) {
			 sum = sum  + arr[i];
		 }
		 
		 if(sum >= target) {
			 return true;
		 }
		 
		 int s = 1;
		 int e = k;
		 
		 while(e < arr.length) {
			 sum = sum + arr[e] - arr[s - 1];
			 
			 if(sum >= target) {
				 return true;
			 }
			 s++;
			 e++;
		 }
		 return false;
	}
	
	public static int minLenghtSubarray(int arr[], int target) {
		int l = 0;
		int r = arr.length - 1;
		int ans = arr.length;
		
		while(l <= r) {
			int mid = (l + r)/2;
			
			if(slidingWindow(arr,mid,target)) {
				ans = Math.min(ans, mid);
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		
		return ans;
	}
	

	public static void main(String[] args) { 
		int arr[] = {2,3,1,2,4,3};
		int target = 2;
		int ans = minLenghtSubarray(arr,target);
		System.out.println("ans:"+ans);       
	}
}
