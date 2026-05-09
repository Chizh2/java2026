class Ab{
    public final void show() {
        System.out.println("Final method");
    }
}

class Ba extends Ab {
    /* 
    @Override
    public void show() {
         System.out.println("New method");
    }
    */
    
}

public class pract24 {
    public static void main(String[] args) {

        Ba b = new Ba();
        b.show();
    }
}
