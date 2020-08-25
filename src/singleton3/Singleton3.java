package singleton3;

public class Singleton3 {
    public static void main(String[] args) {

        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true

    }
}

//懒汉
class Singleton{
    private static Singleton instance;
    public Singleton() { }
    //提供一个共有的静态方法，当使用该方法时，才去创建instance  懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}













