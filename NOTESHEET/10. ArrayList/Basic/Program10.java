
/*
 * Pair sum problem in sorted list
 *      1. Brute Force approach: traverse for all the pair 
 *          -> outer loop: i = 0 to n
 *          -> Inner Loop: j = i+1 to n
 */

import java.util.ArrayList;

class Program {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(" the pair are " + list.get(i) + " and " + list.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // Adding the elements in sorting order
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.add(60);
        arrList.add(70);
        arrList.add(80);
        arrList.add(90);
        int target = 120;
        System.out.println(pairSum(arrList, target));

    }
}