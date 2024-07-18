/*
 * Implementing the custom arrayList:
 *          1. Internal implementation of arrayList is Object array ->
 *             Declared in the line 10 and initialised in the constructor [Line 14]
 * 
 */

class CustomArrayList {
   // Creating the arrayList
   Object[] arrObj = null;

   // Constructor => Parameterised
   public CustomArrayList(int size) {
      arrObj = new Object[size];
   }

   // Constructor => if size is not defined then taking it default as 10
   public CustomArrayList() {
      arrObj = new Object[10];
   }

   public static void main(String[] args) {

   }
}