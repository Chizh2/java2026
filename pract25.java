final class D {

    public void show() {
        System.out.println("Final class method");
    }
}

//Ошибка: нельзя наследоваться от final класса
/*
class B extends A {
    public void show() {
        System.out.println("Override attempt");
    }
}
*/

public class pract25 {
    public static void main(String[] args) {

        D a = new D();
        a.show();
    }
}
