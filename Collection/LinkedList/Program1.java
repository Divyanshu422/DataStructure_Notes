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