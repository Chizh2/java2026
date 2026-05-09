class Parent {

    void show() {
        System.out.println("Parent method");
    }
}

class Child1 extends Parent {
    void show() {
        System.out.println("Child method");
    }
}

public class pract28{
    public static void main(String[] args) {

        Parent obj = new Child1();
        obj.show();
    }
}
