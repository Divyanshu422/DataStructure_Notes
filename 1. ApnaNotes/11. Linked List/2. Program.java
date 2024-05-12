/*
 * class LinkedList {
 * class Node {
 * int data;
 * Node next;
 * 
 * public Node(int data) {
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 * public static Node head;
 * public static Node tail;
 * public static int size; // Default value = 0
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Adding the element to the first list:
 * 
 * public void addFirst(int data) {
 * Node newNode = new Node(data); // Created the new node
 * size++;
 * // If the list is empty
 * if (head == null) {
 * head = tail = newNode;
 * return;
 * } else {
 * newNode.next = head;
 * head = newNode;
 * }
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Adding element to the end of the list
 * 
 * public void addLast(int data) {
 * // Creating the node which need to be added
 * Node newNode = new Node(data);
 * size++;
 * 
 * if (head == null) {
 * head = tail = newNode; // If Linked list is empty
 * }
 * 
 * tail.next = newNode; // Linking the list to the newNode created
 * tail = newNode; // Shifting the tail
 * 
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // For Printing the element, we need gto create a temperory variable which
 * will
 * // be used to traverse the list -> meaning that we will not change the
 * location
 * // of head and tail
 * 
 * public void print() {
 * if (head == null) {
 * System.out.println("Linked List is empty -> No element");
 * return;
 * }
 * // Creating a temporary Node:
 * Node temp = head;
 * 
 * while (temp != null) {
 * System.out.print(temp.data + "->");
 * temp = temp.next; // Moving to next element
 * }
 * System.out.println("null"); // Printing the last element of the List
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Adding the element at an index ->
 * 
 * public void add(int idx, int data) {
 * 
 * // ! Adding the base case: if there is no node
 * if (head == null) {
 * addFirst(data);
 * return;
 * }
 * 
 * // Creating the node:
 * Node newNode = new Node(data);
 * size++;
 * 
 * Node temp = head; // for traversing
 * int i = 0; // for tracking the index
 * while (i < idx - 1) {
 * temp = temp.next;
 * i++;
 * }
 * // Now we are at the one element behind the index
 * // Now we will connect the newNode to the next of the temp
 * newNode.next = temp.next;
 * temp.next = newNode;
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Removing the first Node => i.e. shifting the head to next node
 * 
 * public int removeFirst() {
 * if (size == 0) {
 * System.out.println("Linked list is empty");
 * return Integer.MIN_VALUE;
 * } else if (size == 1) {
 * int val = head.data;
 * head = tail = null;
 * // ! changing the size of the linked list
 * size--;
 * return val;
 * }
 * int val = head.data;
 * head = head.next; // shifting the head pointer
 * // Now first node will be collected by garbage collector.
 * size--;
 * return val;
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Removing the last element from the linked list
 * 
 * public int removeLast() {
 * 
 * // if linked list is empty:
 * if (size == 0) {
 * System.out.println("Linked List is empty");
 * return Integer.MIN_VALUE; // returning the absurd value
 * }
 * 
 * else if (size == 1) {
 * int val = head.data;
 * head = tail = null;
 * size--; // Reducing the size of linkedList
 * return val;
 * }
 * Node temp = head;
 * // Traversing the linked list till the second last element
 * for (int i = 0; i < size - 2; i++) {
 * temp = temp.next;
 * }
 * int val = temp.next.data;
 * temp.next = null;
 * tail = temp;
 * size--;
 * return val;
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Search in Linked List based on the key and return index
 * 
 * public int find(int key) {
 * // Creating temporary node for traversion
 * Node temp = head;
 * int index = 0;
 * 
 * while (temp != null) {
 * if (temp.data == key) {
 * return index;
 * }
 * temp = temp.next;
 * index++;
 * }
 * 
 * // key is not found then
 * return -1;
 * }
 * 
 * // !
 * //
 * --------------------------***************************-----------------------
 * // Recursive search in the LinkedList:
 * 
 * public int recSearch(int key, Node head) {
 * 
 * // Base condition -> if LinkedList is empty
 * if (head == null) {
 * return -1;
 * }
 * // Base condition -> if key is found t
 * if (head.data == key) {
 * return 0; // that is index
 * }
 * // Recursive call
 * int index = recSearch(key, head.next);
 * if (index == -1) {
 * return -1;
 * }
 * // Now adding the index:
 * index = index + 1;
 * return index;
 * 
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * /// Todo: Reversing the linked list:
 * 
 * public void reverse() {
 * 
 * // Base condition: if linked list is empty then
 * if (head == null) {
 * System.out.println("List is empty");
 * return;
 * }
 * 
 * Node prev = null;
 * Node current = tail = head; // Changing the tail to head and creating a
 * Node traversal;
 * Node next;
 * // Iterating and reversing the list:
 * 
 * while (current != null) {
 * next = current.next;
 * current.next = prev;
 * prev = current;
 * current = next;
 * }
 * 
 * // Shifting the head to last node:
 * head = prev;
 * 
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // ToDo: Removing the element from the N-th node from end
 * 
 * public void deleteNthfromEnd(int n) {
 * 
 * // Calculating the size of linked list:
 * int size = 0;
 * Node temp = head;
 * while (temp != null) {
 * temp = temp.next;
 * size++;
 * }
 * 
 * // Handling corner case of the code: meaning if user want to delete the head
 * // node
 * if (size == n) {
 * head = head.next;
 * return;
 * }
 * 
 * // Moving to the previous node of target
 * int i = 1;
 * int indexOfTarget = size - n;
 * Node prev = head;
 * while (i < indexOfTarget) {
 * prev = prev.next;
 * i++;
 * }
 * // Removing the link
 * prev.next = prev.next.next;
 * return;
 * 
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * // Todo: Finding the middle of the list
 * 
 * public Node findMid(Node head) {
 * // Declaring the slow and fast node
 * 
 * Node slow = head;
 * Node fast = head;
 * 
 * // Finding middle:
 * // fast!=null => this condition is for the even node
 * // fast.next !=null => this condition is for the odd node
 * while (fast != null || fast.next != null) {
 * fast = fast.next.next;
 * slow = slow.next;
 * }
 * return slow; // slow is the middle of the list
 * 
 * }
 * 
 * // Todo: Checking palindrome
 * 
 * public boolean isPalindrome() {
 * // Corner case:
 * if (head == null || head.next == null) {
 * return true;
 * }
 * 
 * // ! Step 1: Find the half of the list
 * Node midNode = findMid(head);
 * // ! Step 2: Reversing the 2nd half node
 * 
 * Node currentNode = midNode;
 * Node prev = null;
 * Node next;
 * while (currentNode != null) {
 * next = currentNode.next;
 * currentNode.next = prev;
 * prev = currentNode;
 * currentNode = next;
 * }
 * 
 * // ! Step 3: Checking the palindrome
 * // Now taking 2 node at the extremes
 * 
 * Node right = prev;
 * Node left = head;
 * 
 * while (right != null) {
 * if (left.data != right.data) {
 * return false;
 * }
 * left = left.next;
 * right = right.next;
 * }
 * return true;
 * }
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * 
 * // !
 * //
 * --------------------------***************************------------------------
 * 
 * public static void main(String[] args) {
 * LinkedList list = new LinkedList();
 * list.addFirst(10);
 * list.addFirst(20);
 * list.addFirst(30);
 * list.addLast(50);
 * list.addLast(90);
 * list.print(); // ! 30->20->10->50->90->null
 * list.add(2, 25);
 * list.print(); // ! 30->20->25->10->50->90->null
 * System.out.println(list.size); // 6
 * int removedFirst = list.removeFirst();
 * list.print(); // ! 20->25->10->50->90->null
 * System.out.println(removedFirst); // ! 30
 * int removeLast = list.removeLast();
 * list.print(); // ! 20->25->10->50->null
 * System.out.println(removeLast); // ! 90
 * 
 * System.out.println(list.find(10)); // 2
 * System.out.println(list.find(22)); // -1
 * 
 * System.out.println(list.recSearch(50, head));
 * 
 * list.reverse();
 * list.print(); // ! 50->10->25->20->null
 * 
 * list.deleteNthfromEnd(2);
 * list.print(); // ! 50->10->20->null
 * }
 * }
 */