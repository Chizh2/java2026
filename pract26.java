class ParentClass {
    int value = 10;
    ParentClass() {
        System.out.println("Parent constructor");
    }
    void show() {
        System.out.println("Parent method");
    }
}

class ChildClass extends ParentClass {
    int value = 20;
    ChildClass() {
        super(); //вызов конструктора суперкласса
        System.out.println("Child constructor");
    }
    void print() {
        System.out.println(super.value); //доступ к полю суперкласса

        super.show(); //вызов метода суперкласса
    }
}

public class pract26 {
    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.print();
    }
}
