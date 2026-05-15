import java.util.ArrayList;
import java.util.List;

class Parent {

    void show() {
        System.out.println("Parent show");
    }

    @Deprecated
    void oldMethod() {
        System.out.println("Old method (deprecated)");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child show");
    }

    @SuppressWarnings("unchecked")
    void testWarnings() {

        List list = new ArrayList(); // raw type - warning suppressed
        list.add("text");
        System.out.println(list);
    }
}

public class pract33 {

    public static void main(String[] args) {

        Child c = new Child();
        c.show();

        c.oldMethod();

        c.testWarnings();
    }
}
