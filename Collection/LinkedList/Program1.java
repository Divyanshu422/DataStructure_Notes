/*
 * Writing the code for the LinkedList class
 */

class CustomList {

    class CustomNode {
        Object data;
        CustomNode next;

        // Constructor
        public CustomNode(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    CustomNode head; // * Default value = null
    int size; // * Default value = 0

    public void addNode(Object data) {
        // * Creating the Node when addNode is called
        CustomNode nodeObj = new CustomNode(data);

        // * Checking whether head points to null or any other value
        if (head == null) {
            head = nodeObj;
        }
        // * If head is not null, then we need to traverse the list to find the last
        else {
            CustomNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeObj;
        }
        size++;
    }

    public void addFirst(Object data) {
        CustomNode nodeObj = new CustomNode(data);
        if (head == null)
            head = nodeObj;
        else {
            nodeObj.next = head;
            head = nodeObj;
        }
        size++;
    }

    public Object get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Element does not exist");
        } else if (head == null) {
            throw new Exception("List is empty");
        } else {
            CustomNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void insertAtIndex(Object data, int index) {
        // * Creating the Node when addNode is called
        CustomNode nodeObj = new CustomNode(data);
        if (head == null) {
            head = nodeObj;
        } else {
            CustomNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            nodeObj.next = temp.next;
            temp.next = nodeObj;
        }
        size++;
    }

    public Object removeLastNode() throws Exception {
        if (head == null) {
            throw new Exception("There is no node");
        } else {
            CustomNode temp = head;
            CustomNode temp2 = head.next;

            while (temp2.next != null) {
                temp = temp.next;
                temp2 = temp2.next;
            }
            temp.next = null;
            return temp2.data;
        }
    }

    public Object removeFirstNode() throws Exception {
        if (head == null)
            throw new Exception("No linkedList exist");
        else {
            CustomNode temp = head;
            head = temp.next;
            size--;
            return temp.data;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head == null)
            return "[ ]";
        else {
            CustomNode temp = head;
            sb.append("[ ");
            while (temp.next != null) {
                sb.append(temp.data + ", ");
                temp = temp.next;
            }
            sb.append(temp.data);
            sb.append(" ]");
        }
        return sb.toString();
        // * return sb.toString().concat(" ] ")
    }

}