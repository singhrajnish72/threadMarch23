package threadMarch23.DSA.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/*We are given a tube with one open end, and q queries. 
 *Each query contains 2 integers: X and N.
 *If X=1, insert N into the tube at its open end.
 *If X=2, take out an integer that is occurring the most (i.e., has the largest frequency in the tube),
 *and remove its occurrence closest to the open end of the tube. If the frequency of more than one number 
 *is the same and greatest, we should remove the number closest to the open end of the tube. N is ignored in this query.

Return the list of elements that are removed during the X=2 queries.

Example input
q=6
1,2
1,4
1,3
1,2
2,-1
2,-1

Expected output
[2,3]

*/

public class DeleteElementWithHighestFrequency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for(int i=0; i< t; i++) {
        System.out.println("enter the value of x... "); 
        int x = sc.nextInt();
        System.out.println("enter the value n... ");
        int n = sc.nextInt();
        
        if(x == 1) {
            // map to store integer and its frequency
            map.put(n, map.getOrDefault(n, 0)+1);
            list.add(n);
        } else {
            // System.out.println("Map: " + map);
            
            int maxFreq = 0;
            for(Map.Entry<Integer, Integer> m : map.entrySet()) {
                if(m.getValue() > maxFreq) {
                   maxFreq = m.getValue();   
                }
            }
            // could be multiple values with same frequency, so keep it in a stack and check
            // from the end of the stack if any element is present in the stack
            Set<Integer> set = new HashSet<>();
            for(Map.Entry<Integer, Integer> e: map.entrySet()) {
                if(e.getValue() == maxFreq) {
                    set.add(e.getKey());
                }
            }
            // after the above loop, set will contain all elements with frequency = maxFreq
            // System.out.println("Need to remove one of " + set + " with maxFrequency " + maxFreq);
            int indexToRemove = -1;
            for(int j = list.size() - 1; j >= 0; j--) {
                if(set.contains(list.get(j))) {
                    indexToRemove = j;
                    break;
                }
            }
            int num = list.remove(indexToRemove);
            map.put(num, map.get(num) -1);
            System.out.print(num + " ");
        }
    }

  }

}
