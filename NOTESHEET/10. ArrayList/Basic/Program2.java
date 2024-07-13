/*
 *  Video 4: ArrayList Reverse Order
 *      Approach: we will traverse from last element to 0
 *      last element => arrList.size()-1
 */

 import java.util.ArrayList;

 class Program2 {
     public static void main(String[] args) {
         ArrayList<Integer> arrList = new ArrayList<>();
         // Adding the element
         arrList.add(10);
         arrList.add(20);
         arrList.add(30);
         arrList.add(40);
         arrList.add(50);
         // Reverse the list
         for (int i = arrList.size() - 1; i >= 0; i--) {
             // * To retreive the element we have to use get() method
             System.out.println(arrList.get(i));
         }
     }
 }
 