
// class LinkedList {
// static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size; // Default value = 0

// public static boolean isCycle() {

// // Initialising the slow and fast pointer
// Node slow = head;
// Node fast = head;

// /*
// * Looping the list: the condition is used -> is traversing list.
// * if list is not cyclical then the fast pointer will either points to null or
// * fast.next will point to null meaning list is linear
// */
// while (fast != null && fast.next != null) {
// slow = slow.next; // moving slow by 1 unit
// fast = fast.next.next; // moving fast by 2 unit

// if (slow == fast) {
// return true;
// }
// }
// // Means list is linear => if loop ended
// return false;
// }

// public static void removeCycle() {
// // ! Detecting the cycle
// // Initialising the slow and fast pointer
// Node slow = head;
// Node fast = head;
// boolean cycle = false; // ! we have created a variable which indicates
// whether cycle exist or not

// while (fast != null && fast.next != null) {
// slow = slow.next; // moving slow by 1 unit
// fast = fast.next.next; // moving fast by 2 unit

// if (slow == fast) {
// cycle = true;
// break;
// }
// }

// // ! if cycle dont exist
// if (cycle == false) {
// return;
// }

// // Now if cycle exist we need to find the 2nd last element where node are
// // connected
// Node prev = fast;
// slow = head; // Moving the slow pointer to the head
// while (slow != fast) {
// slow = slow.next;
// prev = fast;
// fast = fast.next;
// }
// // Pointing the previous to null
// prev.next = null;
// }

// public static void main(String[] args) {

// head = new Node(1);
// head.next = new Node(2);
// head.next.next = new Node(3);
// head.next.next.next = head; // List is like: 1->2->3->1

// System.out.println(isCycle());
// removeCycle();

// System.out.println(isCycle());
// }
// }
