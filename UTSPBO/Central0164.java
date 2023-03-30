interface A {
    public void aaa();
}

interface B extends A {
}

class Central0164 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0164 obj = new Central0164();
        System.out.println("main");
        obj.aaa();
    }
}