class Bird {
    public void move() {
        System.out.println("Птица двигается");
    }
}

class Duck extends Bird {
    public void move() {
        System.out.println("Утка плавает");
    }
}

public class pract1 {
    public static void makeBirdMove(Bird bird) {
        bird.move();
    }
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird duck = new Duck();
        makeBirdMove(bird);
        makeBirdMove(duck);
    }
}
