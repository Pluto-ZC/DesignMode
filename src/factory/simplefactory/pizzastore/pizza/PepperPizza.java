package factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PepperPizza preparing;");
    }
}
