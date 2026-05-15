public class pract31 {
    private int value = 10;

    private void outerMethod() {
        System.out.println("Outer private method");
    }

    // Практика #1

    private class InnerPrivate {
    }

    class InnerDefault {
    }

    protected class InnerProtected {
    }
    public class InnerPublic {
        private int number = 5;
        private void innerMethod() {
            System.out.println("Inner private method");
        }

        // Практика #2

        void testInner() {
            System.out.println(value);
            outerMethod();
        }
    }

    // Практика #3

    void testOuter() {
        InnerPublic obj = new InnerPublic();
        System.out.println(obj.number);
        obj.innerMethod();
    }

    public static void main(String[] args) {

        pract31 outer = new pract31();

        pract31.InnerPublic inner = outer.new InnerPublic();

        inner.testInner();

        outer.testOuter();
    }
}


