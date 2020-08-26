package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;


public class LDOrderPizza extends OrderPizaa {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
