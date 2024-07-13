/*
 *  Container with maximum water
 *  Problem: given an arrayList. make a container in which we can have maximum water
 *              maximum water = (width * height)
 *              input => [1, 8, 6, 2, 5, 4, 8, 3, 7]
      
        * Time complexity -> bigO(n): using 2 pointer
 * 
 */

import java.util.ArrayList;

class Program10 {

    // Defining the method
    public static int maxArea(ArrayList<Integer> data) {
        // Initialising the 2 pointer => pointing to the start and end of the array,
        // respectively.
        int left = 0;
        int right = data.size() - 1;
        // Initializing the variable to keep track of area:
        int maxArea = 0;

        // Calculating the till pointer crosses each other:
        while (left < right) {
            int width = right - left;
            int height = Math.min(data.get(left), data.get(right));
            int area = width * height;

            // Checking the maxArea and the area comparison
            if (area > maxArea)
                maxArea = area;

            if (data.get(left) < data.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(8);
        arrList.add(6);
        arrList.add(2);
        arrList.add(5);
        arrList.add(4);
        arrList.add(8);
        arrList.add(3);
        arrList.add(7);

        System.out.println(" the maximum water that can be stored is " + maxArea(arrList) + "unit");

    }
}