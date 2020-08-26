package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class OrderPizaa {
    //构造器
    public OrderPizaa() {
        Pizza pizza = null;
        String orderType;//订购pizza的类型
        do {
            orderType = gettype();
            pizza = createPizza(orderType);//抽象方法，由工厂子类完成
            //输出pizza 制作过程
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
        } while (true);
    }

    //定义一个抽象方法  createPizza  让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}





