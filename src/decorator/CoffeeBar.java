package decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰着模式下的订单：2份巧克力+一份牛奶的LongBlack

        //1、点一份LongBlack
        Drink order = new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDes());

        //2、加入一份牛奶
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        //3、加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        //4、再加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
    }
}
