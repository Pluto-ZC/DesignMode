package singleton4;

public class Singleton4 {
    public static void main(String[] args) {

        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true

    }
}

//懒汉  线程安全  同步方法
class Singleton{
    private static Singleton instance;
    public Singleton() { }
    //提供一个共有的静态方法，加入同步处理的代码，解决线程安全问题 synchronized
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}













