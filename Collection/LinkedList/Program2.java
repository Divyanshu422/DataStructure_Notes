
class Program2 {
    public static void main(String[] args) throws Exception {
        CustomList cstObj = new CustomList();
        cstObj.addNode(10);
        cstObj.addNode(24);
        cstObj.addNode(30);
        cstObj.addNode(40);
        cstObj.addNode(50);
        // cstObj.addFirst(60);
        // cstObj.insertAtIndex(70, 2);

        // Printing the Custom List using toString method
        System.out.println(cstObj); // * [ 10, 24, 30, 40, 50 ]
        // System.out.println(cstObj.size); // * 7
        // System.out.println(cstObj.removeLastNode()); // * 50
        // System.out.println(cstObj); // * [ 60, 10, 70, 20, 30, 40 ]
        // System.out.println(cstObj.get(5)); // * 30
        // System.out.println(cstObj.removeFirstNode()); // * 60
        // System.out.println(cstObj); // * [ 10, 70, 20, 30, 40 ]

    }
}