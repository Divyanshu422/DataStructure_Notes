
// /*
// * Q: Container with most water? Problem statement a
// */

// import java.util.ArrayList;

// class Main {

// public static int storeWater(ArrayList<Integer> height) {
// // MaximumWater Size
// int maxWater = 0;
// for (int i = 0; i < height.size(); i++) {
// for (int j = i + 1; j < height.size(); j++) {
// int ht = Math.min(height.get(i), height.get(j));
// int width = (j - i);
// int currWater = ht * width;
// // * checking the maximum water size => which is greater maxWater or
// currWater
// maxWater = Math.max(maxWater, currWater);
// }
// }
// return maxWater;
// }

// public static void main(String[] args) {

// ArrayList<Integer> Height = new ArrayList<Integer>();
// Height.add(1);
// Height.add(8);
// Height.add(6);
// Height.add(2);
// Height.add(5);
// Height.add(4);
// Height.add(8);
// Height.add(3);
// Height.add(7);

// // Brute force solution
// System.out.println("The maximum capacity of water stored is " +
// storeWater(Height)); //! The maximum capacity of water stored is 49

// }
// }