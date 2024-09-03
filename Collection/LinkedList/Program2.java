
class Program2 {
    public static void main(String[] args) throws Exception {
        CustomList cstObj = new CustomList();
        cstObj.addNode(10);
        cstObj.addNode(20);
        cstObj.addNode(30);
        cstObj.addNode(40);
        cstObj.addNode(50);
        cstObj.addFirst(60);
        // Printing the Custom List using toString method
        System.out.println(cstObj); // * [ 60, 10, 20, 30, 40, 50 ]
        System.out.println(cstObj.size);
        System.out.println(cstObj.get(5));
    }
}