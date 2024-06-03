// import java.util.ArrayList;
// // import java.util.LinkedList;

// class LinkedList {
// class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// // Head and tail =>
// public static Node head;
// public static Node tail;
// public static int size; // Default value of size

// // Method to add the element in last
// public void addLast(int data) {
// // Creating the node which need to be added
// Node newNode = new Node(data);
// size++;

// if (head == null) {
// head = tail = newNode; // If Linked list is empty
// }

// tail.next = newNode; // Linking the list to the newNode created
// tail = newNode; // Shifting the tail

// }

// // Checking palindrome using the arraylist
// public boolean palindrome() {
// // Base case:
// if (head == null || head.next == null) {
// return true; // Empty list or single node list is a palindrome
// }

// ArrayList<Integer> arr = new ArrayList<>();
// Node temp = head; // For traversing the list
// // Coping the data into array list
// while (temp != null) {
// arr.add(temp.data);
// temp = temp.next;
// }
// // Checking the palindrome
// int i = 0;
// int j = arr.size() - 1;

// while (i < j) {
// if (arr.get(i) != arr.get(j)) {
// return false;
// }
// i++;
// j--;
// }
// return true;
// }

// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.addLast(1);
// list.addLast(2);
// list.addLast(3);
// list.addLast(3);
// list.addLast(2);
// list.addLast(1);
// list.addLast(1);
// System.out.println(list.palindrome());
// }
// }