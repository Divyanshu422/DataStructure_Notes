/*
 *  Container with maximum water
 *  Problem: given an arrayList. make a container in which we can have maximum water
 *              maximum water = (width * height)
 *              input => [1, 8, 6, 2, 5, 4, 8, 3, 7]
 * 
 */

import java.util.ArrayList;

class Program9 {

    // Defining the method
    public static int maxArea(ArrayList<Integer> data) {
        // * step 1: Initialize a variable maxArea to keep track of the maximum area
        // found so far.
        int maxArea = 0;
        // * Use a nested loop to iterate through all possible pairs of indices i and j
        // where i < j.
        for (int i = 0; i < data.size(); i++) {
            for (int j = i + 1; j < data.size(); j++) {
                // * Calculating the height and width
                int width = j - i;
                int height = Math.min(data.get(i), data.get(j));
                // * Calculating the area
                int area = width * height;
                if (area > maxArea) {
                    maxArea = area;
                }
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