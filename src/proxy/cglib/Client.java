package proxy.cglib;

//cglib代理
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        //执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
