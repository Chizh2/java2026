class Base {

    public int a = 1;       // доступ везде
    protected int b = 2;    // наследники
    int c = 3;              // default 
    private int d = 4;      // только внутри класса

    public void test() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

//наследник в другом классе 
class Child extends Base {
    public void testChild() {
        System.out.println(a); // public
        System.out.println(b); // protected 
        System.out.println(c); // default 
    }
}

public class pract17 {
    public static void main(String[] args) {

        Base obj = new Base();

        System.out.println(obj.a); // public
        System.out.println(obj.b); // protected 
        System.out.println(obj.c); // default 

        obj.test(); // внутри класса всё доступно

    }
}
