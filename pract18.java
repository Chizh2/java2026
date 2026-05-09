class A {
    // обычный метод
    void show() {
        System.out.println("A show");
    }

    // перегрузка 
    void show(int x) {
        System.out.println("A show " + x);
    }
}

class B extends A {
    // переопределение
    @Override
    void show() {
        System.out.println("B show");
    }
}

public class pract18 {
    public static void main(String[] args) {

        A a = new A();
        a.show();     
        a.show(5);     

        B b = new B();
        b.show();     
        b.show(5);     //унаследованный перегруженный метод
    }
}
