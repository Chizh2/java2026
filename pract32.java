interface MyInterface {

    class NestedClass {

        void show() {
            System.out.println("Method of nested class");
        }
    }
}

public class pract32 {

    public static void main(String[] args) {

        // создание объекта вложенного класса
        MyInterface.NestedClass obj = new MyInterface.NestedClass();

        // вызов метода
        obj.show();
    }
}
