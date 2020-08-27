package factory.absfactory.pizzastore.order;


import factory.absfactory.pizzastore.pizza.LDCheesePizza;
import factory.absfactory.pizzastore.pizza.LDPepperPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
















