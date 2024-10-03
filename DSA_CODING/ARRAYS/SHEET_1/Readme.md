# Arrays Notes:

- StoryLine: Why array introduced and problem with variable -> Problem of Scalability.
- `What?` :
  - List of elements of `same` type placed in `contiguous` memory locations
  - Array is zero-indexed data structure

# Syntax of array Creation:

<div style="display: flex; align-items: center;">
  <img src="./Image/1.png" alt="ArrayCreation" width="300" style="margin-right: 10px;"/>
  <p>
    1. Size of array is static → i.e. we can't change the size at runtime <br/>
    2. Declaring the size of the array is mandatory <br/>
    3. Another syntax of array: in which size of array is equal to number of elements mentioned <br/>
    4. If array is not initialized then the default value is stored in the array. <br/>
    5. Default value: <br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;a. int ⇒ 0 <br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b. String ⇒ null <br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c. char ⇒ \u0000<br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;d. boolean => false <br/>
  </p>
</div>

# Input in the array

- Using the `Scanner class` Object

# Length Property in array:

- length: The length field is used to get the size of the array, and it is accessed directly.
- For example: `${arrayName}.length` will return the size of the array.

# Passing the array as argument:

- Java uses pass-by-value for everything, but when you pass an object (like an array), you are passing the reference to that object by value. This means the method gets a copy of the reference (or pointer) to the array.
- When you pass an array to a method, the method gets a copy of the reference to the original array. Modifying the array elements inside the method will affect the original array since both the original reference and the copy of the reference point to the same array in memory.
- `No Reference Reassignment:` If you try to reassign the array inside the method (i.e., make it point to a new array), the reassignment will not affect the original array outside the method because the reference itself was passed by value.

# Linear Search in array Steps:

- Start at the first element of the array.
- Compare the current element with the element you’re searching for.
  - If it matches, return the index (position) of the element.
  - If it doesn’t match, move to the next element.
- Repeat above Process & if reach the end of the array, meaning the element is not found (in which case you return -1).

```java
    public static int linearSearch(int[] arr, int target) {
        // Step through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // If the target element is found, return its index
            if (arr[i] == target) {
                return i;  // Return the index of the target
            }
        }
        // If the element is not found, return -1
        return -1;
    }
```
