package singleton6;

public class Singleton6 {
    public static void main(String[] args) {

        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true

    }
}

//双重检查
class Singleton {
    private static volatile Singleton instance;
    public Singleton() {  }
    //提供一个静态的共有方法，加入双重检查代码，解决线程安全问题，同时也解决懒加载问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}













