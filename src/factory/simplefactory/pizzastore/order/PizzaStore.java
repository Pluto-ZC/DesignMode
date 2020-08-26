package factory.simplefactory.pizzastore.order;

//相当于客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizaa();

        //使用简单工厂模式
//        new OrderPizaa(new SimpleFactory());
//        System.out.println("退出程序");

        new OrderPizza2();
    }
}
