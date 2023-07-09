package threadJune23.Java;

import java.util.LinkedList;

public class HashMapImplementation {
  
      public static class HashMap<K,V>{
          private class Node{
            K key;
            V value;
          }
          
          private LinkedList<Node> buckets[];
          private int size;
          
          //When we create hashMap then array of bucket get created
          //Each bucket is nothing but list of nodes structured in linkedlist manner.
          //Here I have assumed intial capacity of hashmap is 4;
          public HashMap(){
             buckets = new LinkedList[4];
             for(int i = 0; i < buckets.length; i++) {
               buckets[i] = new LinkedList<>();
             }
             size = 0;
          }
          
          public K put(K key, V value) {
            //bucketIdx - This is bucketNo which hash function returns.
            int bucketIdx = hashFunction(key);
            
            //linkedListIdx - Inside the bucket hashmap traverse the LL and check if given
            //key is present or not by calling .equals methods provided by Java.
            //if key is present then getLLIdx method return the index of that node else -1
            int linkedListIdx = getLLIdx(bucketIdx,key);
            
            if(linkedListIdx == -1) {
              Node node = new Node();
              node.key = key;
              node.value = value;
              buckets[bucketIdx].add(node);
              size++;
            }else {
              Node node = buckets[bucketIdx].get(linkedListIdx);
              node.value = value;
            }
            return key;
          }
          
          /* 
           * get value of corresponding key
           * 
           */
          public V get(K key) {
            int bucketIdx = hashFunction(key);   
            int linkedListIdx = getLLIdx(bucketIdx,key);
            V value = null;
            if(linkedListIdx != -1) {
               Node node = buckets[bucketIdx].get(linkedListIdx);
               value = node.value;
            }
            return value;
          }
               
          public int size() {
            return size;
          }
          
          private int getLLIdx(int bucketIdx, K key) {
            int idx = 0;
            for(Node node : buckets[bucketIdx]) {
                if(node.key.equals(key)) {
                  return idx;
                }
                idx++;
            }
            return -1;
          }

          private int hashFunction(K key) {
            int hash = key.hashCode();
            return Math.abs(hash) % buckets.length;
          }  
      }
      
      public static void main(String args[]) {
           HashMap<Integer, String> map = new HashMap<>();
           map.put(1, "rajnish");
           map.put(2,"Anamika");
           
           System.out.println("name:"+map.get(1));
      }
}
