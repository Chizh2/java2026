class Parent {

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    @Override
    void shwo() {   //ошибка в имени метода
        System.out.println("Child method");
    }
}