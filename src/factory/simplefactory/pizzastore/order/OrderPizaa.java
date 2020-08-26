package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizaa {
    //构造器
//    public OrderPizaa() {
//        Pizza pizza = null;
//        String orderType;//订购pizza的类型
//        do {
//            orderType = gettype();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("GreekPizza");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("CheesePizza");
//            } else {
//                break;
//            }
//            //输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizaa(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入的
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出pizza
            if (pizza != null){ //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购pizza失败");
                break;
            }
        }while (true);
    }

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





