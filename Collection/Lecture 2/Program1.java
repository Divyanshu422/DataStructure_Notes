/*
 * Implementing the custom arrayList:
 *          1. Internal implementation of arrayList is Object array ->
 *             Declared in the [line 13] and initialised in the constructor [Line 17 AND 22]
 *          2. Defining the add method to the arrayList => takes the data and add to the index of object.
 *             The add method takes the object and it is instance method as it is called => as follow arr.add(data)
 *          3. we have defined the index variable which will be used to keep or check whether arrayList is fulled or not
 * 
 */

import java.util.Arrays;

class CustomArrayList {
   // Creating the arrayList
   Object[] arrObj = null;
   int index = 0;

   // Constructor => Parameterised
   public CustomArrayList(int size) {
      arrObj = new Object[size];
   }

   // Constructor => if size is not defined then taking it default as 10
   public CustomArrayList() {
      arrObj = new Object[10];
   }

   public void add(Object obj) {
      // what if object array is filled
      if (index >= arrObj.length) {
         // creating the new array
         int size = arrObj.length + arrObj.length / 2;
         Object[] arrObj1 = new Object[size];
         // Copying the data from old object to new
         /*
          * int i = 0;
          * for (Object data : arrObj) {
          * arrObj1[i] = data;
          * i++;
          * }
          */
         /*
          * Rather than using the for loop for copying the element of old array to
          * newArray => we could have used
          * Arrays class in which there is copyOf method for copying the element from old
          * array to new array
          * Arrays.copyOf(- , -): takes 2 parameter =>
          * 1. First being the old array
          * 2. new Length. the Arrays.copyOf(- , -) return the new array
          */
         arrObj1 = Arrays.copyOf(arrObj, size);

         // Assing the new array to the old array
         arrObj = arrObj1;
      }
      arrObj[index] = obj;
      index++;
   }

   public static void main(String[] args) {
      CustomArrayList obj = new CustomArrayList(5);
      obj.add(10);
      obj.add(20);
      obj.add(30);
      obj.add(40);
      obj.add(50);
      obj.add(60);
      obj.add(70);
      obj.add(80);
      obj.add(90);
      obj.add(100);
      obj.add(110);

   }
}