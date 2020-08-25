package singleton8;

public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton.INSTANCE.sayOK();
        instance.sayOK();
    }
}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
