package proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    //构造器  传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象 ： 是target对象的代理对象
    public Object getProxyInstance(){
        //1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2、设置父类
        enhancer.setSuperclass(target.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法   会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始，。。。。");
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib代理提交.........");
        return returnVal;
    }
}
