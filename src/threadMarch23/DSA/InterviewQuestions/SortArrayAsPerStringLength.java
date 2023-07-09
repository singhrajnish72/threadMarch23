package threadMarch23.DSA.InterviewQuestions;

import java.util.Collections;
import java.util.Comparator;

public class SortArrayAsPerStringLength {
  
  /*
   * We are given an array of strings, we need to sort the array in increasing order of string lengths.
   * 
   * Input : {“GeeksforGeeeks”, “I”, “from”, “am”} 
   * Output : I am from GeeksforGeeks
   * 
   * Input : {“You”, “are”, “beautiful”, “looking”} 
   * Output : You are looking beautiful
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String str[] = {"GeeksforGeeeks", "I", "from", "am"};
//    Arrays.sort(str,new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        
//        if(o1.length() < o2.length()) {
//          return -1;
//        }else if(o1.length() > o2.length()) {
//          return 1;
//        }else {
//          return 0;
//        }
//      }
//    });
    
    // Sorting the ArrayList based on string length using Collections.sort()
//    Collections.sort(str, Comparator.comparingInt(String::length));
     
    for(int i = 0; i < str.length; i++) {
      System.out.print(str[i] + " ");
    }

  }

}
