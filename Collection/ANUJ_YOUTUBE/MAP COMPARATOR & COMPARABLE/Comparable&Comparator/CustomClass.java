
class Animal {
    // Field variables
    private String name;
    private int weight;
    private int age;

    // Constructor
    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    // * to String method
    public String toString() {
        return "Animal { age : " + age + ", name " + name + ", weight " + weight + "/n" + "}";
    }

}