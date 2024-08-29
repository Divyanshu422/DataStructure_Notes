
class A {
    public void m1() {
        System.out.println(" class A method m1");
    }

    public void m3() {
        System.out.println(" class A method m1");
    }
}

class B extends A {
    @Override
    public void m1() {
        System.out.println(" class B method m1");
    }

    public void m2() {
        System.out.println("class B method m2");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1(); // * class B method m1
        b.m2(); // * class B method m2
        b.m3(); // * class A method m1
    }
}

/*
 * List<Integer> listObj = new ArrayList<>();
 */