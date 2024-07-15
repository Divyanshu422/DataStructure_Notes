/*
 * Adding the add method to the linked list class
 */

class Program2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // * Creating the head and tail node => both are static so that all the Node
    // have single Head and tail Node
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1: Creating the Node:
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // * Step 2: linking the new Node to the head of old Node
        newNode.next = head;
        // * Step 3: changing the position of head
        head = newNode;
        return;
    }

    public static void main(String[] args) {
        Program2 ll = new Program2();
        ll.addFirst(10);

    }
}
