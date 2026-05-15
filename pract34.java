// Практика #1
interface MyInterface{
    default void defaultMethod() {
        System.out.println("Default method from interface");
    }

    static void staticMethod() {
        System.out.println("Static method from interface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in class");
    }
}

// Практика #2
interface A {
    default void show() {
        System.out.println("A show");
    }
}

interface B {
    default void show() {
        System.out.println("B show");
    }
}
class C implements A, B {
    @Override
    public void show() {
        System.out.println("Resolved conflict in class C");
        A.super.show();
        B.super.show();
    }
}

public class pract34 {
    public static void main(String[] args) {
        //Практика 1
        MyClass obj = new MyClass();

        obj.defaultMethod();         
        MyInterface.staticMethod();   

        //Практика 2
        C c = new C();
        c.show();
    }
}
