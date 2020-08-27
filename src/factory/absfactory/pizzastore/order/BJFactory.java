package factory.absfactory.pizzastore.order;


import factory.absfactory.pizzastore.pizza.BJCheesePizza;
import factory.absfactory.pizzastore.pizza.BJPepperPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
















