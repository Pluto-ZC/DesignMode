package proxy.dynamic;

//动态代理
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacerDao();

        //给目标对象创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //proxuInstance=class com.sun.proxy.$Proxy0  内存中动态生成了代理对象
        System.out.println("proxuInstance=" + proxyInstance.getClass());

        //通过代理对象 调用 目标对象的方法
        proxyInstance.teach();

        proxyInstance.sayHello("wzc");
    }
}
