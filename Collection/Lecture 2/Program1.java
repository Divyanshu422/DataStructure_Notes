/*
 * Implementing the custom arrayList:
 *          1. Internal implementation of arrayList is Object array ->
 *             Declared in the [line 13] and initialised in the constructor [Line 17 AND 22]
 *          2. Defining the add method to the arrayList => takes the data and add to the index of object.
 *             The add method takes the object and it is instance method as it is called => as follow arr.add(data)
 *          3. we have defined the index variable which will be used to keep or check whether arrayList is fulled or not
 * 
 */

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
      arrObj[index] = obj;
      index++;
   }

   public static void main(String[] args) {

   }
}