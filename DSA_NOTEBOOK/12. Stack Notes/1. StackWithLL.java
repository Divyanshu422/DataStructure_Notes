class StackLL {

    // Creating the Node class which represent the single node of LL
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating the Stack class which will have head
    // the head will be used to represent the Top of the stack

    static class stack {
        public static Node head;

        // Checking is Stack empty or not
        public static boolean isEmpty() {
            return head == null;
        }

        // adding the method for adding the data
        public static void push(int data) {
            // Creating the node
            Node newNode = new Node(data);
            // Checking is stack is empty or not
            if (isEmpty())
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop() {

            if (isEmpty())
                return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack newStack = new stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.peek());
        System.out.println(newStack.pop());
        System.out.println(newStack.peek());

    }
}