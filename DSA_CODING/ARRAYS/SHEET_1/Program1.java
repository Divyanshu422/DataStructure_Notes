
class Program1 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(arr[3]); // * null
        int[] arr2 = new int[5];
        System.out.println(arr2[3]); // * 0
        boolean[] arr3 = new boolean[5];
        System.out.println(arr3[2]); // * false
        float[] arr4 = new float[5];
        System.out.println(arr4[4]); // * 0.0f
        char[] arr5 = new char[5];
        System.out.println(arr5[3]); // * '' @Empty Space
    }
}