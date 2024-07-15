/*
        * Linked List -> 
        *  Node class creation
 */

 class LinkedList {
    // In Java, if you don't explicitly define the access modifier for a class, it
    // is given the default access modifier, which is package-private.
    public static class Node {
        // Node class contains data and reference variable
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating the head and tail node: as static so that whole LinkedList class
    // instance can access it
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(10);
        ll.head.next = new Node(20);
        ll.head.next.next = new Node(30);
        ll.head.next.next.next = new Node(40);
        System.out.println(ll); // * LinkedList@6b95977 */
    }
}
