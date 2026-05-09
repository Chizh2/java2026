class Animal {}
class Dog extends Animal {}
public class pract9 {
    public static void main(String[] args) {
        //Практика #1: операторы 
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);
        
        s1 += " Java";
        System.out.println(s1);
        int a = 6;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);

        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        int max = (a > b) ? a : b;
        System.out.println(max);

        int c = 10;
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
        System.out.println(--c);
        System.out.println(c--);
        System.out.println(c);

        System.out.println((a + b) * 2);

        //Практика #2: instanceof 

        Animal a1 = new Dog();
        Animal a2 = new Animal();
        Animal a3 = null;

        System.out.println(a1 instanceof Dog);     // true
        System.out.println(a2 instanceof Dog);     // false
        System.out.println(a1 instanceof Animal);   // true

        System.out.println(a3 instanceof Dog);     // false
        System.out.println(a3 instanceof Animal);  // false
    }
}
