/*
 *  Maximum in an ArrayList: 
 *  approach: Similar to the array
 *          1. we will define an variable as minimum using Integer.MIN_VALUE;
 *          2. Now we will iterate over the arrayList and check whether the data is greate than the variable_data
 *                  -> if yes, swap
 *                  -> if no -> move to next iteration
 *          3. In the end we will get the result
 */

import java.util.ArrayList;

class Program4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // Adding the element
        arrList.add(10);
        arrList.add(220);
        arrList.add(92);
        arrList.add(32);
        arrList.add(55);
        arrList.add(8);

        // Defining the variable with min value
        int var = Integer.MIN_VALUE; // hence var will have minus infinity

        // for (int i = 0; i < arrList.size(); i++) {
        // if (var < arrList.get(i)) {
        // var = arrList.get(i);
        // }
        // }
        // System.out.println(var); // 92

        // * Using the enchanced for-loop */

        for (Integer data : arrList) {
            // * In Java, the compiler can implicitly convert between Integer (a wrapper
            // class) and int (a primitive data type) through a process called autoboxing
            // and unboxing.
            if (var < data) {
                var = data;
            }
        }
        System.out.println(var); // 220
    }

}
