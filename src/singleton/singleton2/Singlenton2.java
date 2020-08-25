package singleton.singleton2;

public class Singlenton2 {
    public static void main(String[] args) {

        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true

    }
}

//饿汉式（静态代码块）
class Singleton{
    //1、构造器私有化，外部不能new
    private Singleton(){ }
    //2、本类内部创建实例对象
    private final static Singleton instance ;
    //在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }
    //3、提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
