package threadMarch23.DSA.InterviewQuestions;

/*Given a list of non-negative integer numbers as strings, arrange them such that they form the largest number and return it.
Since the result may be very large, you need to return a string instead of an integer.

Input: nums = [“3”,”30”,”34”,”5”,”9”]
Output: "9534330"

solution1:

Example 1.
find the greatest formed using 3 and 30. op - 330

To find the which is greater in A = 3 and B = 30. 
DO num1 = A + B(Append strings A and B)
num2 = B + A

num1 = 330;
num2 = 303;

since num1 > num2 and we need to sort in acending order so swap A and B.

Example 2:
A = 32
B = 34
num1 = A + B = 3234;
num2 = B + A = 3432;
since num1 < num2 so A and B are already sorted. No swap required.

solution1: In the above approach we can use sort method  or Arrays and sort the given 
array lexicographically 

Arrays.sort(A,B -> {
int num1 = (int)A + B;
int num2 = (int)B + A;
if(num1 < num2)
   return -1;
else if(num1 > num2)
   return 1;
else
   return 0;
}
*/


public class LargestNumber {

  public static void main(String[] args) {
    String nums[] = {"3","30","34","5","9"};
    
    for(int i = 0; i < nums.length - 1; i++) {
      String A =   nums[i];
      String B =   nums[i + 1];
      
      Long num1 = Long.valueOf(A + B);
      Long num2 = Long.valueOf(B + A);
      
      if(num1 > num2) {
        String temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
      }
    }
    String ans = "";
    for(int i = nums.length - 1; i >= 0; i--) {
      ans = ans + nums[i];
    }
    System.out.println("ans:"+ans);
  }

}
